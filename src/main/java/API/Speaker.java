package API;

import com.google.cloud.texttospeech.v1.*;
import com.google.protobuf.ByteString;
import jaco.mp3.player.MP3Player;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Speaker {
    private String fileName;
    private String language;
    private MP3Player mp3Player;


    public String getFileName() {
        return fileName;
    }

    /**
     * if this text speaked befor return.
     * else build audio file.
     *
     * @param text input text to speak.
     */
    public void buildMP3(String text) throws Exception {
        fileName = "audioDictionary\\" + text + ".mp3";
        File file = new File(fileName);
        if (file.isFile()) {
            System.out.print("end");
            return;
        }
        System.out.print(fileName);
        try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
            // Set text to synthesis.
            SynthesisInput input = SynthesisInput.newBuilder().setText(text).build();

            // Set audio file.mp3
            AudioConfig audioConfig = AudioConfig.newBuilder().setAudioEncoding(AudioEncoding.MP3).build();

            // Set voice
            VoiceSelectionParams voice =
                    VoiceSelectionParams.newBuilder()
                            .setLanguageCode("en-US") // languageCode = "en_us"
                            .setSsmlGender(SsmlVoiceGender.FEMALE)
                            .build();
            //
            SynthesizeSpeechResponse response =
                    textToSpeechClient.synthesizeSpeech(input, voice, audioConfig);

            // Get the audio contents from the response
            ByteString audioContents = response.getAudioContent();

            // Write the response to the output file.
            try (OutputStream out = new FileOutputStream(fileName)) {
                out.write(audioContents.toByteArray());
                System.out.println("Audio content written to file : " + fileName);
            }
        }


    }

    public void play() {
        mp3Player = new MP3Player(new File(fileName));
        mp3Player.play();
    }

    public void stop() {
        mp3Player.stop();
    }
}

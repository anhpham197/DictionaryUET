cài enviroment variables:

GOOGLE_APPLICATION_CREDENTIALS=link đường dẫn
VD :GOOGLE_APPLICATION_CREDENTIALS=D:\ggAPI\dictionary-uet-5a1633bd8e16.json

thêm maven vào project

thêm câu lệnh sau vào pom.xml

<properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
    </properties>
    <dependencyManagement>
        <dependencies>

            <dependency>
                <groupId>com.google.cloud</groupId>
                <artifactId>libraries-bom</artifactId>
                <version>11.0.0</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <dependencies>
        <dependency>
            <groupId>jaco.mp3.player</groupId>
            <artifactId>MP3</artifactId>
            <version>0.9.3</version>
            <scope>system</scope>
            <systemPath>${basedir}/lib/jaco-mp3-player-0.9.3.jar</systemPath>
        </dependency>

        <dependency>
            <groupId>com.google.cloud</groupId>
            <artifactId>google-cloud-texttospeech</artifactId>
        </dependency>
        
        <dependency>
            <groupId>com.google.cloud</groupId>
            <artifactId>google-cloud-storage</artifactId>
            <version>1.113.1</version>
        </dependency>
        
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.5</version>
        </dependency>

        <dependency>
            <groupId>com.googlecode.json-simple</groupId>
            <artifactId>json-simple</artifactId>
            <version>1.1.1</version>
        </dependency>

        <dependency>
            <groupId>com.squareup.okhttp</groupId>
            <artifactId>okhttp-urlconnection</artifactId>
            <version>2.7.5</version>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.22</version>
        </dependency>

    </dependencies>

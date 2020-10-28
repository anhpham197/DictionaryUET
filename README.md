# Cài đặt từ điển.

- Tạo project.
- Cài đặt Environment Variables.
- Cài đặt dữ liệu SQL.
- Chạy chương trình

## B1:Tạo project.
- Tạo 1 project rỗng. Copy 2 file **src** và **lib** vào trong project.
- Thêm maven vào trong project. Sau khi hoàn tất, project đã được chuyển sang Maven project, trong đó có chứa file pom.xml.thêm những dòng dưới [đây](https://pastebin.com/ydPd3uxE) vào tệp pom.xml ở trong thẻ <project></project>. Reload project. 
## B2:- Cài đặt Environment Variables
- Tạo thêm 1 System variables với **Variable name** là **GOOGLE_APPLICATION_CREDENTIALS** , **Variable value** là đường dẫn dấn đến file dictionary-uet-5a1633bd8e16.json trong lib VD: D:\ggAPI\lib\dictionary-uet-5a1633bd8e16.json . (hướng dẫn thêm System variables : https://www.twilio.com/blog/2017/01/how-to-set-environment-variables.html).

## B3 Cài đặt dữ liệu SQL
- import dữ liệu từ file lib\DictionaryDB_backup.sql vào MySQL.
- sửa LOCALHOST, USERNAME, PASSWORD trong file lib\ConnectToDB.txt.

## B4 Chạy chương trình tại hàm main trong Main.java.

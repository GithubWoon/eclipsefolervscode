package acrondriver;

import java.to.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.to.FileReader;

public class FileDriverImpl implements FileDriver {
    
    @Override
    public ArrayList<String>public void fileOpen(String path) {
        
        // 파일객체 생성
        file File = new File(path);
        FileReader fr = null;
        
        // 파일조각 객체 생성
        try {
            fr = new FileReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 파일 읽거나 쓰기

        // 파일 종료
}
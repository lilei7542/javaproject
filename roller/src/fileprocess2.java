package com.lilei;

import java.io.*;

public class fileprocess2 {
    public static void main(String [] args) throws Exception{
//        createFile("/mtmp/c1");
//        copyFile("/mtmp/b2","/mtmp/b2222");
//        renameFile("/mtmp/b2222","/mtmp/c2222");
//        deleteFile("/mtmp/b1");

    }

    public static void createFile (String destFilename) throws Exception{
        File file = new File(destFilename);
        file.createNewFile();
    }

    public static void copyFile(String sourcefileName, String outfileName) throws Exception {
        File sourcefile = new File(sourcefileName);
        File outfile = new File(outfileName);
        // 复制文件
        FileInputStream input = new FileInputStream(sourcefile);
        FileOutputStream output = new FileOutputStream(outfile);

        BufferedInputStream inputbuff = new BufferedInputStream(input);
        BufferedOutputStream outbuff = new BufferedOutputStream(output);

        byte [] bytes = new byte[1024];
        int len = 0;
        while ((len = inputbuff.read(bytes))!= -1){
            outbuff.write(bytes,0,len);
        }

/*        byte [] bytes = new byte[1024];
        int len = 0;
        while ((len = input.read(bytes))!= -1){
            output.write(bytes,0,len);
        }*/     //也可以实现


        outbuff.close();
        inputbuff.close();
        input.close();
        output.close();
    }

    public static void renameFile(String oldName,String newName){
        File fileName = new File(oldName);
        File newfileName = new File(newName);

        fileName.renameTo(newfileName);
    }

    public static void deleteFile(String needDeletename){
        File filename = new File(needDeletename);
        filename.delete();
    }


}

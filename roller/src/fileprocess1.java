import java.io.*;

public class fileprocess1 {
    public static void main(String [] args) throws Exception{
        modifyGetline();
//        modifyreplaceline();
    }

    public static void modifyGetline() throws Exception{
        String line;
        BufferedReader in = new BufferedReader(new FileReader("/mtmp/dy04.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("/mtmp/dy05.txt"));

/*        while ((line = in.readLine())!=null){

            if (line.indexOf("<td class=\"name\">")!=-1){
                out.println(line.trim());
            }
            else if (line.indexOf("<td class=\"company\">")!=-1){
                out.println(line.trim());
            }
            else if (line.indexOf("<td class=\"position\">")!=-1){
                out.println(line.trim());
            }
            else if (line.indexOf("<td class=\"email\">")!=-1){
                out.println(line.trim());
            }
        }*/
        while ((line = in.readLine())!=null){
            out.print(line+",");
        }



        out.close();
        in.close();
    }

    public static void modifyreplaceline() throws Exception{
        String line;
        BufferedReader in = new BufferedReader(new FileReader("/mtmp/a3.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("/mtmp/a4.txt"));

        while ((line = in.readLine())!=null){
            if ((line.indexOf("name"))!= -1){
                out.print(line.replace("<td class=","{").replace("\">","\":\"").replace("</td>","\","));
            }else if ((line.indexOf("email"))!= -1){
                out.println(line.replace("<td class=","").replace("\">","\":\"").replace("</td>","\"}"));

            }else {
                out.print(line.replace("<td class=","").replace("\">","\":\"").replace("</td>","\",").replace(" ",""));
            }
        }

        in.close();
        out.close();


    }

}

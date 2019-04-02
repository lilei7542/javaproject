import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.api.WechatTools;
import cn.zhouyafeng.itchat4j.beans.BaseMsg;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;

/*
*
*   @author lilei
*   @date   2019.2.25
*   @version 1.0
*   @function 获取微信好友男女比例
*
*/

public class getSexPercentage {
    public static void main(String[] args) {
        String qrPath = "/mtmp/"; // 保存登陆二维码图片的路径，这里需要在本地新建目录
        IMsgHandlerFace msgHandler = new IMsgHandlerFace() {
            @Override
            public String textMsgHandle(BaseMsg baseMsg) {
                return null;
            }

            @Override
            public String picMsgHandle(BaseMsg baseMsg) {
                return null;
            }

            @Override
            public String voiceMsgHandle(BaseMsg baseMsg) {
                return null;
            }

            @Override
            public String viedoMsgHandle(BaseMsg baseMsg) {
                return null;
            }

            @Override
            public String nameCardMsgHandle(BaseMsg baseMsg) {
                return null;
            }

            @Override
            public void sysMsgHandle(BaseMsg baseMsg) {

            }

            @Override
            public String verifyAddFriendMsgHandle(BaseMsg baseMsg) {
                return null;
            }

            @Override
            public String mediaMsgHandle(BaseMsg baseMsg) {
                return null;
            }
        }; // 实现IMsgHandlerFace接口的类
//        IMsgHandlerFace msgHandler = new IMsgHandlerFace(); // 实现IMsgHandlerFace接口的类

        Wechat wechat = new Wechat(msgHandler, qrPath); // 【注入】
//        wechat.start(); // 启动服务，会在qrPath下生成一张二维码图片，扫描即可登陆，注意，二维码图片如果超过一定时间未扫描会过期，过期时会自动更新，所以你可能需要重新打开图片
//        List<String> a1= new ArrayList<>();
        List<JSONObject> a1= new ArrayList<>();

//        a1=WechatTools.getGroupNickNameList();

        a1=WechatTools.getContactList();
//        System.out.println(a1);

//        a1.get(1);
//        System.out.print(a1.get(1).getString(""ChatRoomId":0"));

//        JSONObject z1 =a1.get(1);
//        System.out.println(z1);

        List<String> e1 = new ArrayList<String>();
        if (a1.size()>0){

            for (int i=0;i<a1.size();i++){
                JSONObject b1 = a1.get(i);
                Object c1= b1.get("Sex");
                String d1;
                d1=c1.toString();
                e1.add(d1);
            }
//            System.out.print(e1);
        }
        int k=0;

        for (int j=0;j<e1.size();j++){
            if (e1.get(j).equals("2")){
                k++;
            }
        }
        DecimalFormat df=new DecimalFormat("0.0000%");
        int m=(e1.size()-k);
        float r1 = (float)k/(e1.size());
        float r3 = (float)m/(e1.size());
        String r2 = df.format(r1);
        String r4 = df.format(r3);
        System.out.println("女生占比比例为："+r2);
        System.out.println("男生占比比例为："+r4);

    }

}

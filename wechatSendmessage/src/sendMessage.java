import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.api.MessageTools;
import cn.zhouyafeng.itchat4j.api.WechatTools;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;


public class sendMessage{
    public static void main(String [] args){
        String qrPath = "/mtmp/"; // 保存登陆二维码图片的路径，这里需要在本地新建目录
        IMsgHandlerFace msgHandler = new IHF(); // 实现IMsgHandlerFace接口的类
        Wechat wechat = new Wechat(msgHandler, qrPath); // 【注入】
//        wechat.start();
//        MessageTools.sendMsgByNickName("hi","Jason");

//        List<String> a1 = new ArrayList<String>();
//        a1=WechatTools.getContactNickNameList();
//        System.out.print(a1);

        MessageTools.sendMsgByNickName("👄","heaven娇");


//        String filepath="/mtmp/QR.jpg";
//        MessageTools.sendFileMsgByNickName("Jason",filepath);  //发送文件

//        List<String> a2 = new ArrayList<String>();
//        a2=WechatTools.getGroupIdList();


//        System.out.print(WechatTools.getMemberListByGroupId(WechatTools.getGroupIdList().get(2))); //获取群组成员list信息
    }
}
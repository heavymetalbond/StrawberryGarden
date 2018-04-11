package cn.benhuangfuyao.reflection;

public class RetrievingClassObjects {

    public enum Light {
        RED , GREEN , YELLOW ;
    }
    public static void main(String[] args) {


//        Class c = Light.RED.getClass();

        byte[] bytes = new byte[1024];
        Class c = bytes.getClass();

        System.out.println(Light.class);



    }
}




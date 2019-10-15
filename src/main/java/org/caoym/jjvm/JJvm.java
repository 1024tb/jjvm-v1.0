package org.caoym.jjvm;

import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Created by caoyangmin on 2017/9/7.
 */
public class JJvm {
    static public void main(String[] args){
        //判断如果入参为空，则返回
        if(args.length == 0){
            System.out.println("Usage: <classpath> <JJvm class> [args...]");
            return;
        }
//        将入参加载入虚拟机
//        args[0] path
//        args[1] className
        VirtualMachine vm = new VirtualMachine(Paths.get(args[0]), args[1]);
        try {
            args = Arrays.copyOfRange(args, 2, args.length);
            vm.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

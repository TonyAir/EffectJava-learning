package num1;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.*;

public class ClassOne {
    public ClassOne() throws IOException {
    }


    // 1.用静态工厂方法代替构造器
    public static Boolean valueOf(boolean b){
        return b? Boolean.TRUE:Boolean.FALSE;
    }


    public static void main(String[] args) throws IOException {


        // 静态工厂方法的一些惯用名称

        // from --- 类型转换方法，单参，返回该类型的实例
        Instant instant = Instant.now();
        Date d = Date.from(instant);

        // of --- 聚合方法，带有多个参数，返回该类型的一个实例，把他们合并起来
        Set<Rank> faceCards = EnumSet.of(Rank.JACK, Rank.QUEEN, Rank.KING);

        // valueOf --- 比of 和 from 更繁琐的替代
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

        // instantce / getInstance --- 返回的实例是通过方法的参数来描述的，但不一定与参数具有同样的值
        Map options = new HashMap();
        StackWalker luke  = StackWalker.getInstance(options);

        // create / newInstance --- 每次调用都返回一个新的实例
        int arrayLen = 666;
        Object newArray = Array.newInstance(ClassObject.class,arrayLen);

        // getType --- 像getInstance 一样，但是在工厂方法处于不同类中的时候使用，Type 表示工厂方法所返回的对象类型
        Path path = Paths.get("a.txt");
        FileStore fs  = Files.getFileStore(path);
        // newType --- 像newInstance 一样，但是在工厂方法处于不同类中使用，Type 表示工厂方法所返回的对象类型
        BufferedReader br = Files.newBufferedReader(path);
        // type --- getType 和 newType 的简版
        Enumeration<String> legacyLitany;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        legacyLitany = dayNames.elements();
        ArrayList<String> litany = Collections.list(legacyLitany);

    }



}

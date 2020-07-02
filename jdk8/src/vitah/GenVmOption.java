package vitah;

import java.util.Arrays;

/**
 * 生成VM Option配置，运行时加入这个配置，对JDK源码的改动可以使之生效
 */
public class GenVmOption {
    public static void main(String[] args) {
        String pathTotal = System.getProperty("sun.boot.class.path");
        String[] paths = pathTotal.split(":");
        Arrays.stream(paths).forEach(System.out::println);

        String vmOption = "-Dsun.boot.class.path="
                + "/Users/vitah/Downloads/dev/jdk-analyse/jdk8/out/production/jdk8"
                + ":"
                + pathTotal;
        System.out.println(vmOption);
    }
}

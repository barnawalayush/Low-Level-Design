package pattern.design.java;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("/Users/abarnawal/IdeaProjects/LowLevelDesign/src/main/java/pattern/design/java/text.ser")));
        outputStream.writeObject(dateUtil1);

        DateUtil dateUtil2;
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("/Users/abarnawal/IdeaProjects/LowLevelDesign/src/main/java/pattern/design/java/text.ser")));
        dateUtil2 = (DateUtil) inputStream.readObject();

        inputStream.close();
        outputStream.close();

        DateUtil dateUtil3 = DateUtil.getInstance();
        DateUtil dateUtil4 = (DateUtil) dateUtil3.clone();

        System.out.println(dateUtil3 == dateUtil4);

    }
}
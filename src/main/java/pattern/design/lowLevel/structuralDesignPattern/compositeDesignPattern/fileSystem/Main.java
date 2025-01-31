package pattern.design.lowLevel.structuralDesignPattern.compositeDesignPattern.fileSystem;

import pattern.design.lowLevel.structuralDesignPattern.compositeDesignPattern.fileSystem.Directory;
import pattern.design.lowLevel.structuralDesignPattern.compositeDesignPattern.fileSystem.File;
import pattern.design.lowLevel.structuralDesignPattern.compositeDesignPattern.fileSystem.FileSystem;

public class Main {

    public static void main(String[] args) {

        FileSystem file1 = new File("file1");
        FileSystem file2 = new File("file2");
        Directory directory1 = new Directory("directory1");
        directory1.add(file1);
        directory1.add(file2);
        Directory directory2 = new Directory("directory2");
        FileSystem file3 = new File("file3");
        directory2.add(file3);
        directory1.add(directory2);

        directory1.ls();

    }
}

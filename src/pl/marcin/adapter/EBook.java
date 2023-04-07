package pl.marcin.adapter;

public class EBook implements ElectronicBook{
    private String fileName;
    private String fileFormat;
    private String fileContent;

    public EBook(String fileName, String fileFormat, String fileContent) {
        this.fileName = fileName;
        this.fileFormat = fileFormat;
        this.fileContent = fileContent;
    }

    @Override
    public String getFileName() {
        return  fileName;
    }

    @Override
    public String getFileFormat() {
        return  fileFormat;
    }

    @Override
    public String getFileContent() {
        return  fileContent;
    }
}

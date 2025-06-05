package org.scoula.ex06;

public class BoardVO {
    private int no;
    private String title;
    private String content;
    private String writer;

    public BoardVO(int no, String title, String content, String writer) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}

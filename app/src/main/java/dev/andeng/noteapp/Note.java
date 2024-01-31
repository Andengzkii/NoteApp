package dev.andeng.noteapp;

import java.util.Objects;

public class Note {

    private String id;

    private String title;
    private String content;

    public Note(){

    }

    public String getTitle() {
       return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public  String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Note otherNote = (Note) obj;
        return Objects.equals(title, otherNote.title) && Objects.equals(content, otherNote.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, content);
    }
}

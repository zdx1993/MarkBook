package com.itheima.markbook.processor;

import com.itheima.markbook.data.NoteData;

import java.util.List;

public class DefaultSourceNoteData implements SourceNoteData {

    String noteTopic;
    String filePath;
    List<NoteData> noteDataList;

    public DefaultSourceNoteData(String noteTopic, String filePath, List<NoteData> noteDataList) {
        this.noteTopic = noteTopic;
        this.filePath = filePath;
        this.noteDataList = noteDataList;
    }


    @Override
    public String getNoteTopic() {
        return this.noteTopic;
    }

    @Override
    public String getFilePath() {
        return this.filePath;
    }

    @Override
    public List<NoteData> getNoteDataList() {
        return this.noteDataList;
    }
}

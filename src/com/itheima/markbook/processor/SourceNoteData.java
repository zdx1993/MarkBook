package com.itheima.markbook.processor;

import com.itheima.markbook.data.NoteData;

import java.util.List;

public interface SourceNoteData {

    public String getNoteTopic();

    public String getFilePath();

    public List<NoteData> getNoteDataList();

}

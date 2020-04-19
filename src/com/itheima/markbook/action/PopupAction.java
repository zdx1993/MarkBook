package com.itheima.markbook.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.itheima.markbook.data.DataCenter;
import com.itheima.markbook.dialog.AddNoteDialog;
import com.itheima.markbook.util.NotifyUtil;

public class PopupAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        //获取当前编辑器对象
        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        //获取选择的数据模型
        SelectionModel selectionModel = editor.getSelectionModel();
        //获取当前选择的文本
        String selectedText = selectionModel.getSelectedText();

        //选择的内容
        DataCenter.SELECTED_TEXT = selectedText;
        if(selectedText==null||"".equals(selectedText)){
            NotifyUtil.notifyWarning("没有选中需要记录的内容");
            return;
        }
        //文件名称
        DataCenter.CURRENT_FILE_NAME = e.getRequiredData(CommonDataKeys.PSI_FILE).getViewProvider().getVirtualFile().getName();
        DataCenter.CURRENT_FILE_TYPE =DataCenter.CURRENT_FILE_NAME.substring(DataCenter.CURRENT_FILE_NAME.lastIndexOf(".")+1);


        AddNoteDialog dialog = new AddNoteDialog();
        dialog.show();

    }
}

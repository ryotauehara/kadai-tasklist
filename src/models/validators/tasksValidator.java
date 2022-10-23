package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.tasks;

public class tasksValidator {
    // バリデーションを実行する
    public static List<String> validate(tasks m) {
        List<String> errors = new ArrayList<String>();


        String content_error = validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }


    // タスク課題の必須入力チェック
    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスクの内容を入力してください。";
        }

        return "";
    }
}

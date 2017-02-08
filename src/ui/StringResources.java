package ui;

/**
 * Created by gisinfo on 2016/12/27.
 */
public interface StringResources {
    String PACKAGE_LABEL = "Package";
    String SOURCE_PATH_LABEL = "Source Path";
    String ENTRY_CLASS_NAME = "Entry Class Name";
    String TITLE_GENERATE_ENTRY_CODE = "Generate Entry Code";
    String DEFAULT_ENTRY_NAME = "EntryClass";
    String ACTION_CREAETE_ENTRY = "生成";
    String COPY_ACTION_LABEL = "取消";

    String OVERRIDE_DIALOG_TITLE = "File Already Exists";
    String OVERRIDE_DIALOG_MESSAGE = "File '%s/%s' already exists.\nDo you want to override file content with generated code.";
    String OVERRIDE_DIALOG_YES_TEXT = "Override";
    String OVERRIDE_DIALOG_NO_TEXT = "Cancel";

    String MISSING_SOURCE_PATH_DIALOG_MESSAGE = "You need to select 'Source Path' in which the file will be created.\nSelect one from the project's source roots.";
    String MISSING_SOURCE_PATH_DIALOG_TITLE = "Missing Source Path";
}

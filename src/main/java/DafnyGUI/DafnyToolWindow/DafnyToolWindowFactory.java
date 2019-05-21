package DafnyGUI.DafnyToolWindow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;
import org.wso2.lsp4intellij.editor.EditorEventManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DafnyToolWindowFactory implements ToolWindowFactory {

    private DafnyToolWindowView dafnyToolWindowView = new DafnyToolWindowView();
    private DafnyRunner dafnyRunner;
    private Project project;

    public DafnyToolWindowFactory() {
        dafnyToolWindowView.testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
                System.out.println(EditorEventManager.getDiagnosticsStatic());
            }
        });
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(dafnyToolWindowView.getDafnyMainPanel(), "Dafny Tool Window", false);
        toolWindow.getContentManager().addContent(content);
        this.project = project;
    }
}
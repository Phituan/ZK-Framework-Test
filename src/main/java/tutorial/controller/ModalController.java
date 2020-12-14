package tutorial.controller;

import jdk.nashorn.internal.ir.CallNode;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

public class ModalController extends SelectorComposer<Component> {
    private static final long serialVersionUID = 1L;

    @Listen("onClick = #edit-btn")
    public void showModalEdit(Event e) {
        //create a window programmatically and use it as a modal dialog.
        Window window = (Window) Executions.createComponents(
                "modalCreate.zul", null, null);
        window.doModal();
    }
    @Listen("onClick = #btn-create")
    public void showModalCreate(Event e) {
        //create a window programmatically and use it as a modal dialog.
        Window window = (Window) Executions.createComponents(
                "modalCreate.zul", null, null);
        window.doModal();
    }
    @Listen("onClick = #btn-delete")
    public void showModalDelete(Event e ) {
        Window window = (Window) Executions.createComponents("modalDelete.zul", null, null);
        window.doModal();
    }
}

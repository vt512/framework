package com.vaadin.event.dd;

import com.vaadin.event.dd.acceptCriteria.AcceptAll;
import com.vaadin.event.dd.acceptCriteria.AcceptCriterion;

public interface DropHandler {

    public void drop(DropEvent dropEvent);

    /**
     * Returns the {@link AcceptCriterion} used to evaluate whether the
     * {@link Transferable} will be handed over to {@link DropHandler}. If
     * client side can't verify the {@link AcceptCriterion}, the same criteria
     * may be tested also prior to actual drop - during the drag operation.
     * <p>
     * If everything is accepted developer can return {@link AcceptAll}
     * instance.
     * 
     * @return the {@link AcceptCriterion}
     */
    public AcceptCriterion getAcceptCriterion();

}

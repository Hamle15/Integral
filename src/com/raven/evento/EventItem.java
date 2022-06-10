package com.raven.evento;

import com.raven.model.Model_Item;
import java.awt.Component;

/**
 *
 * @author hamle
 */
public interface EventItem {
    public void itemClick(Component com, Model_Item item);
    
}
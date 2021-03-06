package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.controler.BooleanDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.BinaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;


public class Or extends Element<Boolean> implements LowerDockable<Boolean>{


	Boolean returnValue;
	BooleanDock dock1, dock2;
	//BinaryOperatorView<Boolean, Boolean> view;
	
	public Or() {
		dock1 = new BooleanDock(DockLocation.OR);
		dock2 = new BooleanDock(DockLocation.OR);
		view = new BinaryOperatorView<Boolean, Boolean>("OR", Color.BLACK,
				"hint", dock1, dock2,this);

	}
	

	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);
		dock2.getElement().runElement(animate);
		setData(dock1.getElement().getData() || dock2.getElement().getData());
		return true;
	}
	
	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if ( dockDataType == DataType.BOOLEAN) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" OR kana kuti vakaenza haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}
	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}

	
}

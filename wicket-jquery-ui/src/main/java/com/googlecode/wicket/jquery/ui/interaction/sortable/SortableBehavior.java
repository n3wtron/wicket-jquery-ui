/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.jquery.ui.interaction.sortable;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.CallbackParameter;

import com.googlecode.wicket.jquery.core.JQueryBehavior;
import com.googlecode.wicket.jquery.core.JQueryEvent;
import com.googlecode.wicket.jquery.core.Options;
import com.googlecode.wicket.jquery.core.ajax.IJQueryAjaxAware;
import com.googlecode.wicket.jquery.core.ajax.JQueryAjaxBehavior;

/**
 * Provides a jQuery sortable behavior
 *
 * @author Sebastien Briquet - sebfz1
 */
public abstract class SortableBehavior extends JQueryBehavior implements IJQueryAjaxAware, ISortableListener
{
	private static final long serialVersionUID = 1L;
	private static final String METHOD = "sortable";

	private JQueryAjaxBehavior onStopBehavior;

	/**
	 * Constructor
	 * @param selector the html selector (ie: "#myId")
	 */
	public SortableBehavior(String selector)
	{
		super(selector, METHOD, new Options());
	}

	/**
	 * Constructor
	 * @param selector the html selector (ie: "#myId")
	 * @param options the {@link Options}
	 */
	public SortableBehavior(String selector, Options options)
	{
		super(selector, METHOD, options);
	}

//	/**
//	 * Gets the reference list of all sortable items.<br/>
//	 * Usually the model object of the component on which this {@link SelectableBehavior} is bound to.
//	 *
//	 * @return the {@link List}
//	 */
//	protected abstract List<T> getItemList();


	// Methods //
	@Override
	public void bind(Component component)
	{
		super.bind(component);

		component.add(this.onStopBehavior = this.newOnStopBehavior());
	}


	// Events //
	@Override
	public void onConfigure(Component component)
	{
		super.onConfigure(component);

		this.setOption("stop", this.onStopBehavior.getCallbackFunction());
	}

	@Override
	public void onAjax(AjaxRequestTarget target, JQueryEvent event)
	{
		if (event instanceof StopEvent)
		{
			int index = 0; //TODO get the item index
			int position = 0; //TODO get the new position

//			T item = null;
//			List<T> list = this.getItemList();
//
//			// defensive, if the item-selector is miss-configured, this can result in an OutOfBoundException
//			if (index < list.size())
//			{
//				item = list.get(index);
//			}

			this.onSort(target, index, position);
		}
	}

	// Factories //
	/**
	 * Gets the ajax behavior that will be triggered when the user has selected items
	 *
	 * @return the {@link JQueryAjaxBehavior}
	 */
	protected JQueryAjaxBehavior newOnStopBehavior()
	{
		return new JQueryAjaxBehavior(this) {

			private static final long serialVersionUID = 1L;

			@Override
			protected CallbackParameter[] getCallbackParameters()
			{
				return new CallbackParameter[] {
						CallbackParameter.context("event"),
						CallbackParameter.context("ui"),
						CallbackParameter.resolved("index", "ui.index"),
						CallbackParameter.resolved("posision", "ui.position") };
			}

			@Override
			public CharSequence getCallbackFunctionBody(CallbackParameter... parameters)
			{
				return super.getCallbackFunctionBody(parameters);
			}

			@Override
			protected JQueryEvent newEvent()
			{
				return new StopEvent();
			}
		};
	}

	// Event Objects //
	/**
	 * Provides an event object that will be broadcasted by the {@link JQueryAjaxBehavior} 'stop' callback
	 */
	protected static class StopEvent extends JQueryEvent
	{
		public StopEvent()
		{
//			int index = RequestCycleUtils.getQueryParameterValue("index").toInt(0);
//			int position = RequestCycleUtils.getQueryParameterValue("position").toInt(0);
		}
	}
}
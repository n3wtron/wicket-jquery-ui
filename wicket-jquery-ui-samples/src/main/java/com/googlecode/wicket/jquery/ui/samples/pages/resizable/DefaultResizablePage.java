package com.googlecode.wicket.jquery.ui.samples.pages.resizable;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.Form;

import com.googlecode.wicket.jquery.ui.Options;
import com.googlecode.wicket.jquery.ui.form.button.AjaxButton;
import com.googlecode.wicket.jquery.ui.interaction.resizable.ResizableBehavior;

public class DefaultResizablePage extends AbstractResizablePage
{
	private static final long serialVersionUID = 1L;

	public DefaultResizablePage()
	{
		final Form<?> form = new Form<Void>("form");
		this.add(form);

		// ResizableBehavior //
		Options options = new Options();
		options.set("minWidth", 200);
		options.set("maxWidth", 720);
		options.set("minHeight", 100);
		options.set("maxHeight", 300);

		form.add(new ResizableBehavior("#resizable", options));

		// Button //
		form.add(new AjaxButton("refresh") {

			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form)
			{
				super.onSubmit(target, form);

				target.add(form); //used to test the re-rendering
			}
		});
	}
}

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
package com.googlecode.wicket.jquery.ui;

import com.googlecode.wicket.jquery.ui.form.button.Button;

/**
 * Provides some default jQuery icon class. Might be used to decorate a {@link Button} for instance.
 *
 * @author Sebastien Briquet - sebfz1
 *
 */
public enum JQueryIcon
{
	NONE(""),

	BLANK("ui-icon-blank"), //XXX: report as new
	CARAT_1_N("ui-icon-carat-1-n"),
	CARAT_1_NE("ui-icon-carat-1-ne"),
	CARAT_1_E("ui-icon-carat-1-e"),
	CARAT_1_SE("ui-icon-carat-1-se"),
	CARAT_1_S("ui-icon-carat-1-s"),
	CARAT_1_SW("ui-icon-carat-1-sw"),
	CARAT_1_W("ui-icon-carat-1-w"),
	CARAT_1_NW("ui-icon-carat-1-nw"),
	CARAT_2_N_S("ui-icon-carat-2-n-s"),
	CARAT_2_E_W("ui-icon-carat-2-e-w"),
	TRIANGLE_1_N("ui-icon-triangle-1-n"),
	TRIANGLE_1_NE("ui-icon-triangle-1-ne"),
	TRIANGLE_1_E("ui-icon-triangle-1-e"),
	TRIANGLE_1_SE("ui-icon-triangle-1-se"),
	TRIANGLE_1_S("ui-icon-triangle-1-s"),
	TRIANGLE_1_SW("ui-icon-triangle-1-sw"),
	TRIANGLE_1_W("ui-icon-triangle-1-w"),
	TRIANGLE_1_NW("ui-icon-triangle-1-nw"),
	TRIANGLE_2_N_S("ui-icon-triangle-2-n-s"),
	TRIANGLE_2_E_W("ui-icon-triangle-2-e-w"),
	ARROW_1_N("ui-icon-arrow-1-n"),
	ARROW_1_NE("ui-icon-arrow-1-ne"),
	ARROW_1_E("ui-icon-arrow-1-e"),
	ARROW_1_SE("ui-icon-arrow-1-se"),
	ARROW_1_S("ui-icon-arrow-1-s"),
	ARROW_1_SW("ui-icon-arrow-1-sw"),
	ARROW_1_W("ui-icon-arrow-1-w"),
	ARROW_1_NW("ui-icon-arrow-1-nw"),
	ARROW_2_N_S("ui-icon-arrow-2-n-s"),
	ARROW_2_NE_SW("ui-icon-arrow-2-ne-sw"),
	ARROW_2_E_W("ui-icon-arrow-2-e-w"),
	ARROW_2_SE_NW("ui-icon-arrow-2-se-nw"),
	ARROWSTOP_1_N("ui-icon-arrowstop-1-n"),
	ARROWSTOP_1_E("ui-icon-arrowstop-1-e"),
	ARROWSTOP_1_S("ui-icon-arrowstop-1-s"),
	ARROWSTOP_1_W("ui-icon-arrowstop-1-w"),
	ARROWTHICK_1_N("ui-icon-arrowthick-1-n"),
	ARROWTHICK_1_NE("ui-icon-arrowthick-1-ne"),
	ARROWTHICK_1_E("ui-icon-arrowthick-1-e"),
	ARROWTHICK_1_SE("ui-icon-arrowthick-1-se"),
	ARROWTHICK_1_S("ui-icon-arrowthick-1-s"),
	ARROWTHICK_1_SW("ui-icon-arrowthick-1-sw"),
	ARROWTHICK_1_W("ui-icon-arrowthick-1-w"),
	ARROWTHICK_1_NW("ui-icon-arrowthick-1-nw"),
	ARROWTHICK_2_N_S("ui-icon-arrowthick-2-n-s"),
	ARROWTHICK_2_NE_SW("ui-icon-arrowthick-2-ne-sw"),
	ARROWTHICK_2_E_W("ui-icon-arrowthick-2-e-w"),
	ARROWTHICK_2_SE_NW("ui-icon-arrowthick-2-se-nw"),
	ARROWTHICKSTOP_1_N("ui-icon-arrowthickstop-1-n"),
	ARROWTHICKSTOP_1_E("ui-icon-arrowthickstop-1-e"),
	ARROWTHICKSTOP_1_S("ui-icon-arrowthickstop-1-s"),
	ARROWTHICKSTOP_1_W("ui-icon-arrowthickstop-1-w"),
	ARROWRETURNTHICK_1_W("ui-icon-arrowreturnthick-1-w"),
	ARROWRETURNTHICK_1_N("ui-icon-arrowreturnthick-1-n"),
	ARROWRETURNTHICK_1_E("ui-icon-arrowreturnthick-1-e"),
	ARROWRETURNTHICK_1_S("ui-icon-arrowreturnthick-1-s"),
	ARROWRETURN_1_W("ui-icon-arrowreturn-1-w"),
	ARROWRETURN_1_N("ui-icon-arrowreturn-1-n"),
	ARROWRETURN_1_E("ui-icon-arrowreturn-1-e"),
	ARROWRETURN_1_S("ui-icon-arrowreturn-1-s"),
	ARROWREFRESH_1_W("ui-icon-arrowrefresh-1-w"),
	ARROWREFRESH_1_N("ui-icon-arrowrefresh-1-n"),
	ARROWREFRESH_1_E("ui-icon-arrowrefresh-1-e"),
	ARROWREFRESH_1_S("ui-icon-arrowrefresh-1-s"),
	ARROW_4("ui-icon-arrow-4"),
	ARROW_4_DIAG("ui-icon-arrow-4-diag"),
	EXTLINK("ui-icon-extlink"),
	NEWWIN("ui-icon-newwin"),
	REFRESH("ui-icon-refresh"),
	SHUFFLE("ui-icon-shuffle"),
	TRANSFER_E_W("ui-icon-transfer-e-w"),
	TRANSFERTHICK_E_W("ui-icon-transferthick-e-w"),
	FOLDER_COLLAPSED("ui-icon-folder-collapsed"),
	FOLDER_OPEN("ui-icon-folder-open"),
	DOCUMENT("ui-icon-document"),
	DOCUMENT_B("ui-icon-document-b"),
	NOTE("ui-icon-note"),
	MAIL_CLOSED("ui-icon-mail-closed"),
	MAIL_OPEN("ui-icon-mail-open"),
	SUITCASE("ui-icon-suitcase"),
	COMMENT("ui-icon-comment"),
	PERSON("ui-icon-person"),
	PRINT("ui-icon-print"),
	TRASH("ui-icon-trash"),
	LOCKED("ui-icon-locked"),
	UNLOCKED("ui-icon-unlocked"),
	BOOKMARK("ui-icon-bookmark"),
	TAG("ui-icon-tag"),
	HOME("ui-icon-home"),
	FLAG("ui-icon-flag"),
	CALCULATOR("ui-icon-calculator"),
	CART("ui-icon-cart"),
	PENCIL("ui-icon-pencil"),
	CLOCK("ui-icon-clock"),
	DISK("ui-icon-disk"),
	CALENDAR("ui-icon-calendar"),
	ZOOMIN("ui-icon-zoomin"),
	ZOOMOUT("ui-icon-zoomout"),
	SEARCH("ui-icon-search"),
	WRENCH("ui-icon-wrench"),
	GEAR("ui-icon-gear"),
	HEART("ui-icon-heart"),
	STAR("ui-icon-star"),
	LINK("ui-icon-link"),
	CANCEL("ui-icon-cancel"),
	PLUS("ui-icon-plus"),
	PLUSTHICK("ui-icon-plusthick"),
	MINUS("ui-icon-minus"),
	MINUSTHICK("ui-icon-minusthick"),
	CLOSE("ui-icon-close"),
	CLOSETHICK("ui-icon-closethick"),
	KEY("ui-icon-key"),
	LIGHTBULB("ui-icon-lightbulb"),
	SCISSORS("ui-icon-scissors"),
	CLIPBOARD("ui-icon-clipboard"),
	COPY("ui-icon-copy"),
	CONTACT("ui-icon-contact"),
	IMAGE("ui-icon-image"),
	VIDEO("ui-icon-video"),
	SCRIPT("ui-icon-script"),
	ALERT("ui-icon-alert"),
	INFO("ui-icon-info"),
	NOTICE("ui-icon-notice"),
	HELP("ui-icon-help"),
	CHECK("ui-icon-check"),
	BULLET("ui-icon-bullet"),
	RADIO_OFF("ui-icon-radio-off"),
	RADIO_ON("ui-icon-radio-on"),
	PIN_W("ui-icon-pin-w"),
	PIN_S("ui-icon-pin-s"),
	PLAY("ui-icon-play"),
	PAUSE("ui-icon-pause"),
	SEEK_NEXT("ui-icon-seek-next"),
	SEEK_PREV("ui-icon-seek-prev"),
	SEEK_END("ui-icon-seek-end"),
	SEEK_FIRST("ui-icon-seek-first"),
	STOP("ui-icon-stop"),
	EJECT("ui-icon-eject"),
	VOLUME_OFF("ui-icon-volume-off"),
	VOLUME_ON("ui-icon-volume-on"),
	POWER("ui-icon-power"),
	SIGNAL_DIAG("ui-icon-signal-diag"),
	SIGNAL("ui-icon-signal"),
	BATTERY_0("ui-icon-battery-0"),
	BATTERY_1("ui-icon-battery-1"),
	BATTERY_2("ui-icon-battery-2"),
	BATTERY_3("ui-icon-battery-3"),
	CIRCLE_PLUS("ui-icon-circle-plus"),
	CIRCLE_MINUS("ui-icon-circle-minus"),
	CIRCLE_CLOSE("ui-icon-circle-close"),
	CIRCLE_TRIANGLE_E("ui-icon-circle-triangle-e"),
	CIRCLE_TRIANGLE_S("ui-icon-circle-triangle-s"),
	CIRCLE_TRIANGLE_W("ui-icon-circle-triangle-w"),
	CIRCLE_TRIANGLE_N("ui-icon-circle-triangle-n"),
	CIRCLE_ARROW_E("ui-icon-circle-arrow-e"),
	CIRCLE_ARROW_S("ui-icon-circle-arrow-s"),
	CIRCLE_ARROW_W("ui-icon-circle-arrow-w"),
	CIRCLE_ARROW_N("ui-icon-circle-arrow-n"),
	CIRCLE_ZOOMIN("ui-icon-circle-zoomin"),
	CIRCLE_ZOOMOUT("ui-icon-circle-zoomout"),
	CIRCLE_CHECK("ui-icon-circle-check"),
	CIRCLESMALL_PLUS("ui-icon-circlesmall-plus"),
	CIRCLESMALL_MINUS("ui-icon-circlesmall-minus"),
	CIRCLESMALL_CLOSE("ui-icon-circlesmall-close"),
	SQUARESMALL_PLUS("ui-icon-squaresmall-plus"),
	SQUARESMALL_MINUS("ui-icon-squaresmall-minus"),
	SQUARESMALL_CLOSE("ui-icon-squaresmall-close"),
	GRIP_DOTTED_VERTICAL("ui-icon-grip-dotted-vertical"),
	GRIP_DOTTED_HORIZONTAL("ui-icon-grip-dotted-horizontal"),
	GRIP_SOLID_VERTICAL("ui-icon-grip-solid-vertical"),
	GRIP_SOLID_HORIZONTAL("ui-icon-grip-solid-horizontal"),
	GRIPSMALL_DIAGONAL_SE("ui-icon-gripsmall-diagonal-se"),
	GRIP_DIAGONAL_SE("ui-icon-grip-diagonal-se");

	private String cssClass;

	private JQueryIcon(String cssClass)
	{
		this.cssClass = cssClass;
	}

	@Override
	public String toString()
	{
		return this.cssClass;
	}
}

module project01 {
	exports reserve.dto;
	exports reserve.controller;
	exports reserve.main;
	exports seat.controller;
	exports seat.main;
	exports seat.dto;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
}
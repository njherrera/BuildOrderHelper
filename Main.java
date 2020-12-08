package com.mucholabs;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BuildOrder ZvXMacroRoachHydra = new BuildOrder();
		ZvXMacroRoachHydra.loadBuildFromFile("C:\\Users\\natha_000\\Documents\\sc2 builds\\Easy ZvX macro roach, hydra, broodlord (ZvX Economic).txt");
		Scheduler buildSchedule = new Scheduler();
		buildSchedule.processBuildOrder(ZvXMacroRoachHydra);
	}

}

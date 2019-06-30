package com.edu.msc.sliit.service;

import org.springframework.stereotype.Service;

@Service
public class Normalization {
	public static String sinhalaNormalization(String text) {
		// System.out.println(text);
		// Letter ක
		text = text.replace("ක*ආ*", "කා*");
		text = text.replace("ක*ඇ*", "කැ*");
		text = text.replace("ක*ඈ*", "කෑ*");
		text = text.replace("ක*ඉ*", "කි*");
		text = text.replace("ක*ඊ*", "කී*");
		text = text.replace("ක*උ*", "කු*");
		text = text.replace("ක*ඌ*", "කූ*");
		text = text.replace("ක*එ*", "කෙ*");
		text = text.replace("ක*ඒ*", "කේ*");
		text = text.replace("ක*ඔ*", "කො*");
		text = text.replace("ක*ඕ*", "කෝ*");
		text = text.replace("ක*ඖ*", "කෞ*");
		text = text.replace("p*ක*", "ක්*");
		text = text.replace("ක්*උ*", "කෘ*");
		text = text.replace("ක්*ඌ*", "කෲ*");

		// Letter ර
		text = text.replace("ර*ආ*", "රා*");
		text = text.replace("ර*ඇ*", "රැ*");
		text = text.replace("ර*ඈ*", "රූ*");
		text = text.replace("ර*ඉ*", "රි*");
		text = text.replace("ර*ඊ*", "රී*");
		text = text.replace("ර*උ*", "රු*");
		text = text.replace("ර*ඌ*", "රූ*");
		text = text.replace("ර*එ*", "රෙ*");
		text = text.replace("ර*ඒ*", "රේ*");
		text = text.replace("ර*ඔ*", "රො*");
		text = text.replace("ර*ඕ*", "රෝ*");
		text = text.replace("ර*ඖ*", "රෞ*");
		text = text.replace("p*ර*", "ර්*");
		text = text.replace("ර්*උ*", "රෟ*");
		text = text.replace("ර්*ඌ*", "රෲ*");

		// Letter න
		text = text.replace("න*ආ*", "නා*");
		text = text.replace("න*ඇ*", "නැ*");
		text = text.replace("න*ඈ*", "නෑ*");
		text = text.replace("න*ඉ*", "නි*");
		text = text.replace("න*ඊ*", "නී*");
		text = text.replace("න*උ*", "නු*");
		text = text.replace("න*ඌ*", "නූ*");
		text = text.replace("න*එ*", "නෙ*");
		text = text.replace("න*ඒ*", "නේ*");
		text = text.replace("න*ඔ*", "නො*");
		text = text.replace("න*ඕ*", "නෝ*");
		text = text.replace("න*ඖ*", "නෞ*");
		text = text.replace("p*න*", "න්*");
		text = text.replace("න්*උ*", "නෘ*");
		text = text.replace("න්*ඌ*", "නෲ*");

		// Letter හ
		text = text.replace("හ*ආ*", "හා*");
		text = text.replace("හ*ඇ*", "හැ*");
		text = text.replace("හ*ඈ*", "හෑ*");
		text = text.replace("හ*ඉ*", "හි*");
		text = text.replace("හ*ඊ*", "හී*");
		text = text.replace("හ*උ*", "හු*");
		text = text.replace("හ*ඌ*", "හූ*");
		text = text.replace("හ*එ*", "හෙ*");
		text = text.replace("හ*ඒ*", "හේ*");
		text = text.replace("හ*ඔ*", "හො*");
		text = text.replace("හ*ඕ*", "හෝ*");
		text = text.replace("හ*ඖ*", "හෞ*");
		text = text.replace("p*හ*", "හ්*");
		text = text.replace("හ්*උ*", "හෘ*");
		text = text.replace("හ්*ඌ*", "හෲ*");
		
		// Letter ග
		text = text.replace("ග*ආ*", "ගා*");
		text = text.replace("ග*ඇ*", "ගැ*");
		text = text.replace("ග*ඈ*", "ගෑ*");
		text = text.replace("ග*ඉ*", "ගි*");
		text = text.replace("ග*ඊ*", "ගී*");
		text = text.replace("ග*උ*", "ගු*");
		text = text.replace("ග*ඌ*", "ගූ*");
		text = text.replace("ග*එ*", "ගෙ*");
		text = text.replace("ග*ඒ*", "ගේ*");
		text = text.replace("ග*ඔ*", "ගො*");
		text = text.replace("ග*ඕ*", "ගෝ*");
		text = text.replace("ග*ඖ*", "ගෞ*");
		text = text.replace("p*ග*", "ග්*");
		text = text.replace("ග්*උ*", "ගෘ*");
		text = text.replace("ග්*ඌ*", "ගෲ*");
		
		// Letter ච
		text = text.replace("ච*ආ*", "චා*");
		text = text.replace("ච*ඇ*", "චැ*");
		text = text.replace("ච*ඈ*", "චෑ*");
		text = text.replace("ච*ඉ*", "චි*");
		text = text.replace("ච*ඊ*", "චී*");
		text = text.replace("ච*උ*", "චු*");
		text = text.replace("ච*ඌ*", "චූ*");
		text = text.replace("ච*එ*", "චෙ*");
		text = text.replace("ච*ඒ*", "චේ*");
		text = text.replace("ච*ඔ*", "චො*");
		text = text.replace("ච*ඕ*", "චෝ*");
		text = text.replace("ච*ඖ*", "චෞ*");
		text = text.replace("p*ච*", "ච්*");
		text = text.replace("ච්*උ*", "චෘ*");
		text = text.replace("ච්*ඌ*", "චෲ*");
		
		// Letter ජ
		text = text.replace("ජ*ආ*", "ජා*");
		text = text.replace("ජ*ඇ*", "ජැ*");
		text = text.replace("ජ*ඈ*", "ජෑ*");
		text = text.replace("ජ*ඉ*", "ජි*");
		text = text.replace("ජ*ඊ*", "ජී*");
		text = text.replace("ජ*උ*", "ජු*");
		text = text.replace("ජ*ඌ*", "ජූ*");
		text = text.replace("ජ*එ*", "ජෙ*");
		text = text.replace("ජ*ඒ*", "ජේ*");
		text = text.replace("ජ*ඔ*", "ජො*");
		text = text.replace("ජ*ඕ*", "ජෝ*");
		text = text.replace("ජ*ඖ*", "ජෞ*");
		text = text.replace("p*ජ*", "ජ්*");
		text = text.replace("ජ්*උ*", "ජෘ*");
		text = text.replace("ජ්*ඌ*", "ජෲ*");

		// Letter ට
		text = text.replace("ට*ආ*", "ටා*");
		text = text.replace("ට*ඇ*", "ටැ*");
		text = text.replace("ට*ඈ*", "ටෑ*");
		text = text.replace("ට*ඉ*", "ටි*");
		text = text.replace("ට*ඊ*", "ටී*");
		text = text.replace("ට*උ*", "ටු*");
		text = text.replace("ට*ඌ*", "ටූ*");
		text = text.replace("ට*එ*", "ටෙ*");
		text = text.replace("ට*ඒ*", "ටේ*");
		text = text.replace("ට*ඔ*", "ටො*");
		text = text.replace("ට*ඕ*", "ටෝ*");
		text = text.replace("ට*ඖ*", "ටෞ*");
		text = text.replace("p*ට*", "ට්*");
		text = text.replace("ට්*උ*", "ටෘ*");
		text = text.replace("ට්*ඌ*", "ටෲ*");
		
		// Letter ඩ
		text = text.replace("ඩ*ආ*", "ඩා*");
		text = text.replace("ඩ*ඇ*", "ඩැ*");
		text = text.replace("ඩ*ඈ*", "ඩෑ*");
		text = text.replace("ඩ*ඉ*", "ඩි*");
		text = text.replace("ඩ*ඊ*", "ඩී*");
		text = text.replace("ඩ*උ*", "ඩු*");
		text = text.replace("ඩ*ඌ*", "ඩූ*");
		text = text.replace("ඩ*එ*", "ඩෙ*");
		text = text.replace("ඩ*ඒ*", "ඩේ*");
		text = text.replace("ඩ*ඔ*", "ඩො*");
		text = text.replace("ඩ*ඕ*", "ඩෝ*");
		text = text.replace("ඩ*ඖ*", "ඩෞ*");
		text = text.replace("p*ඩ*", "ඩ්*");
		text = text.replace("ඩ්*උ*", "ඩෘ*");
		text = text.replace("ඩ්*ඌ*", "ඩෲ*");
		
		// Letter ණ
		text = text.replace("ණ*ආ*", "ණා*");
		text = text.replace("ණ*ඇ*", "ණැ*");
		text = text.replace("ණ*ඈ*", "ණෑ*");
		text = text.replace("ණ*ඉ*", "ණි*");
		text = text.replace("ණ*ඊ*", "ණී*");
		text = text.replace("ණ*උ*", "ණු*");
		text = text.replace("ණ*ඌ*", "ණූ*");
		text = text.replace("ණ*එ*", "ණෙ*");
		text = text.replace("ණ*ඒ*", "ණේ*");
		text = text.replace("ණ*ඔ*", "ණො*");
		text = text.replace("ණ*ඕ*", "ණෝ*");
		text = text.replace("ණ*ඖ*", "ණෞ*");
		text = text.replace("p*ණ*", "ණ්*");
		text = text.replace("ණ්*උ*", "ණෘ*");
		text = text.replace("ණ්*ඌ*", "ණෲ*");
		
		// Letter ත
		text = text.replace("ත*ආ*", "තා*");
		text = text.replace("ත*ඇ*", "තැ*");
		text = text.replace("ත*ඈ*", "තෑ*");
		text = text.replace("ත*ඉ*", "ති*");
		text = text.replace("ත*ඊ*", "තී*");
		text = text.replace("ත*උ*", "තු*");
		text = text.replace("ත*ඌ*", "තූ*");
		text = text.replace("ත*එ*", "තෙ*");
		text = text.replace("ත*ඒ*", "තේ*");
		text = text.replace("ත*ඔ*", "තො*");
		text = text.replace("ත*ඕ*", "තෝ*");
		text = text.replace("ත*ඖ*", "තෞ*");
		text = text.replace("p*ත*", "ත්*");
		text = text.replace("ත්*උ*", "තෘ*");
		text = text.replace("ත්*ඌ*", "තෲ*");
		text = text.replace("ත්*ර*", "ත්‍ර*");
		text = text.replace("ත්*රා*", "ත්‍රා*");
		
		// Letter ද
		text = text.replace("ද*ආ*", "දා*");
		text = text.replace("ද*ඇ*", "දැ*");
		text = text.replace("ද*ඈ*", "දෑ*");
		text = text.replace("ද*ඉ*", "දි*");
		text = text.replace("ද*ඊ*", "දී*");
		text = text.replace("ද*උ*", "දු*");
		text = text.replace("ද*ඌ*", "දූ*");
		text = text.replace("ද*එ*", "දෙ*");
		text = text.replace("ද*ඒ*", "දේ*");
		text = text.replace("ද*ඔ*", "දො*");
		text = text.replace("ද*ඕ*", "දෝ*");
		text = text.replace("ද*ඖ*", "දෞ*");
		text = text.replace("p*ද*", "ද්*");
		text = text.replace("ද්*උ*", "දෘ*");
		text = text.replace("ද්*ඌ*", "දෲ*");
		
		// Letter ප
		text = text.replace("ප*ආ*", "පා*");
		text = text.replace("ප*ඇ*", "පැ*");
		text = text.replace("ප*ඈ*", "පෑ*");
		text = text.replace("ප*ඉ*", "පි*");
		text = text.replace("ප*ඊ*", "පී*");
		text = text.replace("ප*උ*", "පු*");
		text = text.replace("ප*ඌ*", "පූ*");
		text = text.replace("ප*එ*", "පෙ*");
		text = text.replace("ප*ඒ*", "පේ*");
		text = text.replace("ප*ඔ*", "පො*");
		text = text.replace("ප*ඕ*", "පෝ*");
		text = text.replace("ප*ඖ*", "පෞ*");
		text = text.replace("p*ප*", "ප්*");
		text = text.replace("ප්*උ*", "පෘ*");
		text = text.replace("ප්*ඌ*", "පෲ*");
		text = text.replace("ප්*ර*", "ප්‍ර*");
		text = text.replace("ප්*රා*", "ප්‍රා*");
		
		// Letter බ
		text = text.replace("බ*ආ*", "බා*");
		text = text.replace("බ*ඇ*", "බැ*");
		text = text.replace("බ*ඈ*", "බෑ*");
		text = text.replace("බ*ඉ*", "බි*");
		text = text.replace("බ*ඊ*", "බී*");
		text = text.replace("බ*උ*", "බු*");
		text = text.replace("බ*ඌ*", "බූ*");
		text = text.replace("බ*එ*", "බෙ*");
		text = text.replace("බ*ඒ*", "බේ*");
		text = text.replace("බ*ඔ*", "බො*");
		text = text.replace("බ*ඕ*", "බෝ*");
		text = text.replace("බ*ඖ*", "බෞ*");
		text = text.replace("p*බ*", "බ්*");
		text = text.replace("බ්*උ*", "බෘ*");
		text = text.replace("බ්*ඌ*", "බෲ*");
		
		// Letter ම
		text = text.replace("ම*ආ*", "මා*");
		text = text.replace("ම*ඇ*", "මැ*");
		text = text.replace("ම*ඈ*", "මෑ*");
		text = text.replace("ම*ඉ*", "මි*");
		text = text.replace("ම*ඊ*", "මී*");
		text = text.replace("ම*උ*", "මු*");
		text = text.replace("ම*ඌ*", "මූ*");
		text = text.replace("ම*එ*", "මෙ*");
		text = text.replace("ම*ඒ*", "මේ*");
		text = text.replace("ම*ඔ*", "මො*");
		text = text.replace("ම*ඕ*", "මෝ*");
		text = text.replace("ම*ඖ*", "මෞ*");
		text = text.replace("p*ම*", "ම්*");
		text = text.replace("ම්*උ*", "මෘ*");
		text = text.replace("ම්*ඌ*", "මෲ*");
		
		// Letter ෆ
		text = text.replace("ෆ*ආ*", "ෆා*");
		text = text.replace("ෆ*ඇ*", "ෆැ*");
		text = text.replace("ෆ*ඈ*", "ෆෑ*");
		text = text.replace("ෆ*ඉ*", "ෆි*");
		text = text.replace("ෆ*ඊ*", "ෆී*");
		text = text.replace("ෆ*උ*", "ෆු*");
		text = text.replace("ෆ*ඌ*", "ෆූ*");
		text = text.replace("ෆ*එ*", "ෆෙ*");
		text = text.replace("ෆ*ඒ*", "ෆේ*");
		text = text.replace("ෆ*ඔ*", "ෆො*");
		text = text.replace("ෆ*ඕ*", "ෆෝ*");
		text = text.replace("ෆ*ඖ*", "ෆෞ*");
		text = text.replace("p*ෆ*", "ෆ්*");
		text = text.replace("ෆ්*උ*", "ෆෘ*");
		text = text.replace("ෆ්*ඌ*", "ෆෲ*");
		
		// Letter ය
		text = text.replace("ය*ආ*", "යා*");
		text = text.replace("ය*ඇ*", "යැ*");
		text = text.replace("ය*ඈ*", "යෑ*");
		text = text.replace("ය*ඉ*", "යි*");
		text = text.replace("ය*ඊ*", "යී*");
		text = text.replace("ය*උ*", "යු*");
		text = text.replace("ය*ඌ*", "යූ*");
		text = text.replace("ය*එ*", "යෙ*");
		text = text.replace("ය*ඒ*", "යේ*");
		text = text.replace("ය*ඔ*", "යො*");
		text = text.replace("ය*ඕ*", "යෝ*");
		text = text.replace("ය*ඖ*", "යෞ*");
		text = text.replace("p*ය*", "ය්*");
		text = text.replace("ය්*උ*", "යෘ*");
		text = text.replace("ය්*ඌ*", "යෲ*");
		
		// Letter ල
		text = text.replace("ල*ආ*", "ලා*");
		text = text.replace("ල*ඇ*", "ලැ*");
		text = text.replace("ල*ඈ*", "ලෑ*");
		text = text.replace("ල*ඉ*", "ලි*");
		text = text.replace("ල*ඊ*", "ලී*");
		text = text.replace("ල*උ*", "ලු*");
		text = text.replace("ල*ඌ*", "ලූ*");
		text = text.replace("ල*එ*", "ලෙ*");
		text = text.replace("ල*ඒ*", "ලේ*");
		text = text.replace("ල*ඔ*", "ලො*");
		text = text.replace("ල*ඕ*", "ලෝ*");
		text = text.replace("ල*ඖ*", "ලෞ*");
		text = text.replace("p*ල*", "ල්*");
		text = text.replace("ල්*උ*", "ලෘ*");
		text = text.replace("ල්*ඌ*", "ලෲ*");
		
		// Letter ව
		text = text.replace("ව*ආ*", "වා*");
		text = text.replace("ව*ඇ*", "වැ*");
		text = text.replace("ව*ඈ*", "වෑ*");
		text = text.replace("ව*ඉ*", "වි*");
		text = text.replace("ව*ඊ*", "වී*");
		text = text.replace("ව*උ*", "වු*");
		text = text.replace("ව*ඌ*", "වූ*");
		text = text.replace("ව*එ*", "වෙ*");
		text = text.replace("ව*ඒ*", "වේ*");
		text = text.replace("ව*ඔ*", "වො*");
		text = text.replace("ව*ඕ*", "වෝ*");
		text = text.replace("ව*ඖ*", "වෞ*");
		text = text.replace("p*ව*", "ව්*");
		text = text.replace("ව්*උ*", "වෘ*");
		text = text.replace("ව්*ඌ*", "වෲ*");
		
		// Letter ශ
		text = text.replace("ශ*ආ*", "ශා*");
		text = text.replace("ශ*ඇ*", "ශැ*");
		text = text.replace("ශ*ඈ*", "ශෑ*");
		text = text.replace("ශ*ඉ*", "ශි*");
		text = text.replace("ශ*ඊ*", "ශී*");
		text = text.replace("ශ*උ*", "ශු*");
		text = text.replace("ශ*ඌ*", "ශූ*");
		text = text.replace("ශ*එ*", "ශෙ*");
		text = text.replace("ශ*ඒ*", "ශේ*");
		text = text.replace("ශ*ඔ*", "ශො*");
		text = text.replace("ශ*ඕ*", "ශෝ*");
		text = text.replace("ශ*ඖ*", "ශෞ*");
		text = text.replace("p*ශ*", "ශ්*");
		text = text.replace("ශ්*උ*", "ශෘ*");
		text = text.replace("ශ්*ඌ*", "ශෲ*");
		text = text.replace("ශ්*ර*", "ශ්‍ර*");
		text = text.replace("ශ්*රා*", "ශ්‍රා*");
		
		// Letter ෂ
		text = text.replace("ෂ*ආ*", "ෂා*");
		text = text.replace("ෂ*ඇ*", "ෂැ*");
		text = text.replace("ෂ*ඈ*", "ෂෑ*");
		text = text.replace("ෂ*ඉ*", "ෂි*");
		text = text.replace("ෂ*ඊ*", "ෂී*");
		text = text.replace("ෂ*උ*", "ෂු*");
		text = text.replace("ෂ*ඌ*", "ෂූ*");
		text = text.replace("ෂ*එ*", "ෂෙ*");
		text = text.replace("ෂ*ඒ*", "ෂේ*");
		text = text.replace("ෂ*ඔ*", "ෂො*");
		text = text.replace("ෂ*ඕ*", "ෂෝ*");
		text = text.replace("ෂ*ඖ*", "ෂෞ*");
		text = text.replace("p*ෂ*", "ෂ්*");
		text = text.replace("ෂ්*උ*", "ෂෘ*");
		text = text.replace("ෂ්*ඌ*", "ෂෲ*");
		
		// Letter ස
		text = text.replace("ස*ආ*", "සා*");
		text = text.replace("ස*ඇ*", "සැ*");
		text = text.replace("ස*ඈ*", "සෑ*");
		text = text.replace("ස*ඉ*", "සි*");
		text = text.replace("ස*ඊ*", "සී*");
		text = text.replace("ස*උ*", "සු*");
		text = text.replace("ස*ඌ*", "සූ*");
		text = text.replace("ස*එ*", "සෙ*");
		text = text.replace("ස*ඒ*", "සේ*");
		text = text.replace("ස*ඔ*", "සො*");
		text = text.replace("ස*ඕ*", "සෝ*");
		text = text.replace("ස*ඖ*", "සෞ*");
		text = text.replace("p*ස*", "ස්*");
		text = text.replace("ස්*උ*", "සෘ*");
		text = text.replace("ස්*ඌ*", "සෲ*");
		
		// Letter ළ
		text = text.replace("ළ*ආ*", "ළා*");
		text = text.replace("ළ*ඇ*", "ළැ*");
		text = text.replace("ළ*ඈ*", "ළෑ*");
		text = text.replace("ළ*ඉ*", "ළි*");
		text = text.replace("ළ*ඊ*", "ළී*");
		text = text.replace("ළ*උ*", "ළු*");
		text = text.replace("ළ*ඌ*", "ළූ*");
		text = text.replace("ළ*එ*", "ළෙ*");
		text = text.replace("ළ*ඒ*", "ළේ*");
		text = text.replace("ළ*ඔ*", "ළො*");
		text = text.replace("ළ*ඕ*", "ළෝ*");
		text = text.replace("ළ*ඖ*", "ළෞ*");
		text = text.replace("p*ළ*", "ළ්*");
		text = text.replace("ළ්*උ*", "ළෘ*");
		text = text.replace("ළ්*ඌ*", "ළෲ*");
		
		// Letter ඳ
		text = text.replace("ඳ*ආ*", "ඳා*");
		text = text.replace("ඳ*ඇ*", "ඳැ*");
		text = text.replace("ඳ*ඈ*", "ඳෑ *");
		text = text.replace("ඳ*ඉ*", "ඳි*");
		text = text.replace("ඳ*ඊ*", "ඳී*");
		text = text.replace("ඳ*උ*", "ඳු*");
		text = text.replace("ඳ*ඌ*", "ඳූ*");
		text = text.replace("ඳ*එ*", "ඳෙ*");
		text = text.replace("ඳ*ඒ*", "ඳේ*");
		text = text.replace("ඳ*ඔ*", "ඳො*");
		text = text.replace("ඳ*ඕ*", "ඳෝ*");
		text = text.replace("ඳ*ඖ*", "ඳෞ*");
		text = text.replace("p*ඳ*", "ඳ්*");
		text = text.replace("ඳ්*උ*", "ඳෘ*");
		text = text.replace("ඳ්*ඌ*", "ඳෲ*");
		  
		// Letter ධ
		text = text.replace("ධ*ආ*", "ධා*");
		text = text.replace("ධ*ඇ*", "ධැ*");
		text = text.replace("ධ*ඈ*", "ගෑ*");
		text = text.replace("ධ*ඉ*", "ධි*");
		text = text.replace("ධ*ඊ*", "ධී*");
		text = text.replace("ධ*උ*", "ධු*");
		text = text.replace("ධ*ඌ*", "ධූ*");
		text = text.replace("ධ*එ*", "ධෙ*");
		text = text.replace("ධ*ඒ*", "ධේ*");
		text = text.replace("ධ*ඔ*", "ධො*");
		text = text.replace("ධ*ඕ*", "ධෝ*");
		text = text.replace("ධ*ඖ*", "ධෞ*");
		text = text.replace("p*ධ*", "ධ්*");
		text = text.replace("ධ්*උ*", "ධෘ*");
		text = text.replace("ධ්*ඌ*", "ධෲ*");
		
		// Letter ඝ
		text = text.replace("ඝ*ආ*", "ඝා*");
		text = text.replace("ඝ*ඇ*", "ඝැ*");
		text = text.replace("ඝ*ඈ*", "ඝෑ*");
		text = text.replace("ඝ*ඉ*", "ඝි*");
		text = text.replace("ඝ*ඊ*", "ඝී*");
		text = text.replace("ඝ*උ*", "ඝු*");
		text = text.replace("ඝ*ඌ*", "ඝූ*");
		text = text.replace("ඝ*එ*", "ඝෙ*");
		text = text.replace("ඝ*ඒ*", "ඝේ*");
		text = text.replace("ඝ*ඔ*", "ඝො*");
		text = text.replace("ඝ*ඕ*", "ඝෝ*");
		text = text.replace("ඝ*ඖ*", "ඝෞ*");
		text = text.replace("p*ඝ*", "ඝ්*");
		text = text.replace("ඝ්*උ*", "ඝෘ*");
		text = text.replace("ඝ්*ඌ*", "ඝෲ*");
		
		// Letter භ
		text = text.replace("භ*ආ*", "භා*");
		text = text.replace("භ*ඇ*", "භැ*");
		text = text.replace("භ*ඈ*", "භෑ*");
		text = text.replace("භ*ඉ*", "භි*");
		text = text.replace("භ*ඊ*", "භී*");
		text = text.replace("භ*උ*", "භු*");
		text = text.replace("භ*ඌ*", "භූ*");
		text = text.replace("භ*එ*", "භෙ*");
		text = text.replace("භ*ඒ*", "භේ*");
		text = text.replace("භ*ඔ*", "භො*");
		text = text.replace("භ*ඕ*", "භෝ*");
		text = text.replace("භ*ඖ*", "භෞ*");
		text = text.replace("p*භ*", "භ්*");
		text = text.replace("භ්*උ*", "භෘ*");
		text = text.replace("භ්*ඌ*", "භෲ*");
		
		// Letter ඟ
		text = text.replace("ඟ*ආ*", "ඟා*");
		text = text.replace("ඟ*ඇ*", "ඟැ*");
		text = text.replace("ඟ*ඈ*", "ඟෑ*");
		text = text.replace("ඟ*ඉ*", "ඟි*");
		text = text.replace("ඟ*ඊ*", "ඟී*");
		text = text.replace("ඟ*උ*", "ඟු*");
		text = text.replace("ඟ*ඌ*", "ඟූ*");
		text = text.replace("ඟ*එ*", "ඟෙ*");
		text = text.replace("ඟ*ඒ*", "ඟේ*");
		text = text.replace("ඟ*ඔ*", "ඟො*");
		text = text.replace("ඟ*ඕ*", "ඟෝ*");
		text = text.replace("ඟ*ඖ*", "ඟෞ*");
		text = text.replace("p*ඟ*", "ඟ්*");
		text = text.replace("ඟ්*උ*", "ඟෘ*");
		text = text.replace("ඟ්*ඌ*", "ඟෲ*");
		
		// Letter ඹ
		text = text.replace("ඹ*ආ*", "ඹා*");
		text = text.replace("ඹ*ඇ*", "ඹැ*");
		text = text.replace("ඹ*ඈ*", "ඹෑ*");
		text = text.replace("ඹ*ඉ*", "ඹි*");
		text = text.replace("ඹ*ඊ*", "ඹී*");
		text = text.replace("ඹ*උ*", "ඹු*");
		text = text.replace("ඹ*ඌ*", "ඹූ*");
		text = text.replace("ඹ*එ*", "ඹෙ*");
		text = text.replace("ඹ*ඒ*", "ඹේ*");
		text = text.replace("ඹ*ඔ*", "ඹො*");
		text = text.replace("ඹ*ඕ*", "ඹෝ*");
		text = text.replace("ඹ*ඖ*", "ඹෞ*");
		text = text.replace("p*ඹ*", "ඹ්*");
		text = text.replace("ඹ්*උ*", "ඹෘ*");
		text = text.replace("ඹ්*ඌ*", "ඹෲ*");
		
		// Letter ඵ
		text = text.replace("ඵ*ආ*", "ඵා*");
		text = text.replace("ඵ*ඇ*", "ඵැ*");
		text = text.replace("ඵ*ඈ*", "ඵෑ*");
		text = text.replace("ඵ*ඉ*", "ඵි*");
		text = text.replace("ඵ*ඊ*", "ඵී*");
		text = text.replace("ඵ*උ*", "ඵු*");
		text = text.replace("ඵ*ඌ*", "ඵූ*");
		text = text.replace("ඵ*එ*", "ඵෙ*");
		text = text.replace("ඵ*ඒ*", "ඵේ*");
		text = text.replace("ඵ*ඔ*", "ඵො*");
		text = text.replace("ඵ*ඕ*", "ඵෝ*");
		text = text.replace("ඵ*ඖ*", "ඵෞ*");
		text = text.replace("p*ඵ*", "ඵ්*");
		text = text.replace("ඵ්*උ*", "ඵෘ*");
		text = text.replace("ඵ්*ඌ*", "ඵෲ*");
		
		// Letter ඤ
		text = text.replace("ඤ*ආ*", "ඤා*");
		text = text.replace("ඤ*ඇ*", "ඤැ*");
		text = text.replace("ඤ*ඈ*", "ඤෑ*");
		text = text.replace("ඤ*ඉ*", "ඤි*");
		text = text.replace("ඤ*ඊ*", "ඤී*");
		text = text.replace("ඤ*උ*", "ඤු*");
		text = text.replace("ඤ*ඌ*", "ඤූ*");
		text = text.replace("ඤ*එ*", "ඤෙ*");
		text = text.replace("ඤ*ඒ*", "ඤේ*");
		text = text.replace("ඤ*ඔ*", "ඤො*");
		text = text.replace("ඤ*ඕ*", "ඤෝ*");
		text = text.replace("ඤ*ඖ*", "ඤෞ*");
		text = text.replace("p*ඤ*", "ඤ්*");
		text = text.replace("ඤ්*උ*", "ඤෘ*");
		text = text.replace("ඤ්*ඌ*", "ඤෲ*");
		
		// Letter ඣ
		text = text.replace("ඣ*ආ*", "ඣා*");
		text = text.replace("ඣ*ඇ*", "ඣැ*");
		text = text.replace("ඣ*ඈ*", "ඣෑ*");
		text = text.replace("ඣ*ඉ*", "ඣි*");
		text = text.replace("ඣ*ඊ*", "ඣී*");
		text = text.replace("ඣ*උ*", "ඣු*");
		text = text.replace("ඣ*ඌ*", "ඣූ*");
		text = text.replace("ඣ*එ*", "ඣෙ*");
		text = text.replace("ඣ*ඒ*", "ඣේ*");
		text = text.replace("ඣ*ඔ*", "ඣො*");
		text = text.replace("ඣ*ඕ*", "ඣෝ*");
		text = text.replace("ඣ*ඖ*", "ඣෞ*");
		text = text.replace("p*ඣ*", "ඣ්*");
		text = text.replace("ඣ්*උ*", "ඣෘ*");
		text = text.replace("ඣ්*ඌ*", "ඣෲ*");
		
		// Special Letters

		text = text.replace("16*ර*", "ඍ*");
		text = text.replace("32*ර*", "ඎ*");
		text = text.replace("16*ල*", "ඏ*");
		text = text.replace("32*ල*", "ඐ*");

		text = text.replace("06*ග*", "ඟ*");
		text = text.replace("06*ඩ*", "ඬ*");
		text = text.replace("06*ද*", "ඳ*");
		text = text.replace("06*බ*", "ඹ*");

		//According to the text correction correct
		text = text.replace("ක*ඍ*", "කෘ*");
		text = text.replace("ග*ඍ*", "ගෘ*");

		text = text.replace("ක්*රි*", "ක්‍රි*");
		text = text.replace("ක්*ර*", "ක්‍ර*");

		
		String word = text.toString();
		// System.out.println(word);
		// String word="Sasindu";
		return word;
	}
}

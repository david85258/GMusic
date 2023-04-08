package dev.geco.gmusic.objects;

public enum NotePitch {
	NOTE__24(-24, 0.500000F),
	NOTE__23(-23, 0.529732F),
	NOTE__22(-22, 0.561231F),
	NOTE__21(-21, 0.594604F),
	NOTE__20(-20, 0.629961F),
	NOTE__19(-19, 0.667420F),
	NOTE__18(-18, 0.707107F),
	NOTE__17(-17, 0.749154F),
	NOTE__16(-16, 0.793701F),
	NOTE__15(-15, 0.840896F),
	NOTE__14(-14, 0.890899F),
	NOTE__13(-13, 0.943874F), //20
	NOTE__12(-12, 1.000000F), //21
	NOTE__11(-11, 1.059463F), //22
	NOTE__10(-10, 1.122462F),
	NOTE__9(-9, 1.189207F),
	NOTE__8(-8, 1.259921F),
	NOTE__7(-7, 1.334840F),
	NOTE__6(-6, 1.414214F),
	NOTE__5(-5, 1.498307F),
	NOTE__4(-4, 1.587401F),
	NOTE__3(-3, 1.681793F),
	NOTE__2(-2, 1.781797F),
	NOTE__1(-1, 1.887749F),
	NOTE_0(0, 0.50000F),
	NOTE_1(1, 0.52973F),
	NOTE_2(2, 0.56123F),
	NOTE_3(3, 0.59461F),
	NOTE_4(4, 0.62995F),
	NOTE_5(5, 0.66741F),
	NOTE_6(6, 0.70711F),
	NOTE_7(7, 0.74916F),
	NOTE_8(8, 0.79370F),
	NOTE_9(9, 0.84089F),
	NOTE_10(10, 0.89091F),
	NOTE_11(11, 0.94386F),
	NOTE_12(12, 1.00000F),
	NOTE_13(13, 1.05945F),
	NOTE_14(14, 1.12245F),
	NOTE_15(15, 1.18920F),
	NOTE_16(16, 1.25993F),
	NOTE_17(17, 1.33484F),
	NOTE_18(18, 1.41420F),
	NOTE_19(19, 1.49832F),
	NOTE_20(20, 1.58741F),
	NOTE_21(21, 1.68180F),
	NOTE_22(22, 1.78180F),
	NOTE_23(23, 1.88775F),
	NOTE_24(24, 2.00000F), //57
	NOTE_25(25, 0.529732F), // 58
	NOTE_26(26, 0.561231F), // 59
	NOTE_27(27, 0.594604F),
	NOTE_28(28, 0.629961F),
	NOTE_29(29, 0.667420F),
	NOTE_30(30, 0.707107F),
	NOTE_31(31, 0.749154F),
	NOTE_32(32, 0.793701F),
	NOTE_33(33, 0.840896F),
	NOTE_34(34, 0.890899F),
	NOTE_35(35, 0.943874F),
	NOTE_36(36, 1.000000F),
	NOTE_37(37, 1.059463F),
	NOTE_38(38, 1.122462F),
	NOTE_39(39, 1.189207F),
	NOTE_40(40, 1.259921F),
	NOTE_41(41, 1.334840F),
	NOTE_42(42, 1.414214F),
	NOTE_43(43, 1.498307F),
	NOTE_44(44, 1.587401F),
	NOTE_45(45, 1.681793F),
	NOTE_46(46, 1.781797F),
	NOTE_47(47, 1.887749F),
	NOTE_48(48, 2.000000F);

	private int n;
	private float ppo;
	
	NotePitch(int Note, float PitchPost) {
		n = Note;
		ppo = PitchPost;
	}
	
	public static float getPitch(int Note) {
		if(Note < -24) return 0.5f;
		if(Note > 48) return 2f;
		for(NotePitch np : values()) if(np.n == Note) return np.ppo;
		return 1.0f;
	}

	public static int getOctave(int note) {
		if (note < 0) return 0;
		else if (note > 24) return 2;
		else return 1;
	}
}
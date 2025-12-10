package tech.codoverse;

public final class Season extends Enum {
   public static final Season SUMMER = new Season("SUMMER", 0, "High");
   public static final Season MONSOON = new Season("MONSOON", 1, "Low");
   public static final Season WINTER = new Season("WINTER", 2, "Meidum");
   private final String traffic;
   // $FF: synthetic field
   private static final Season[] ENUM$VALUES = new Season[]{SUMMER, MONSOON, WINTER};

   private Season(String var1, int var2, String traffic) {
      super(var1, var2);
      this.traffic = traffic;
   }

   public String getTraffic() {
      return this.traffic;
   }

   public static Season[] values() {
      Season[] var0;
      int var1;
      Season[] var2;
      System.arraycopy(var0 = ENUM$VALUES, 0, var2 = new Season[var1 = var0.length], 0, var1);
      return var2;
   }

   public static Season valueOf(String var0) {
      return (Season)Enum.valueOf(Season.class, var0);
   }
}

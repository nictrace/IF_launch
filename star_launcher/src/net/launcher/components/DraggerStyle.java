package net.launcher.components;

import net.launcher.components.Dragger;

public class DraggerStyle {

   public int x = 0;
   public int y = 0;
   public int w = 0;
   public int h = 0;


   public DraggerStyle(int x, int y, int w, int h) {
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
   }

   public void apply(Dragger dragger) {
      dragger.setBounds(this.x, this.y, this.w, this.h);
   }
}

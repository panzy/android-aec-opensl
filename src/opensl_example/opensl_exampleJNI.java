/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package opensl_example;

public class opensl_exampleJNI {

  static {
    try {
        java.lang.System.loadLibrary("webrtc_audio_preprocessing");
        java.lang.System.loadLibrary("speex");
        java.lang.System.loadLibrary("opensl_example");
    } catch (UnsatisfiedLinkError e) {
        java.lang.System.err.println("native code library failed to load.\n" + e);
        java.lang.System.exit(1);
    }
  }

  public final static native void start(int jarg1, int jarg2, int jarg3);
  public final static native void runNearendProcessing();
  public final static native void stop();
  public final static native int push(short[] jarg2);
  public final static native int pull(short[] jarg2);
  public final static native int estimate_delay(int jarg1);
  public final static native double getTimestamp();
}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package opensl_example;

public class opensl_exampleJNI {

  static {
    try {
        java.lang.System.loadLibrary("opensl_example");
    } catch (UnsatisfiedLinkError e) {
        java.lang.System.err.println("native code library failed to load.\n" + e);
        java.lang.System.exit(1);
    }
  }

  public final static native void start_process();
  public final static native void stop_process();
  public final static native int push(short[] jarg2);
  public final static native int pull(short[] jarg2);
  public final static native double getTimestamp();
}

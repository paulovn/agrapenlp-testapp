/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.grapenlp.core;

public class u_trie_string {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected u_trie_string(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(u_trie_string obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public long size() {
    return jgrapenlpJNI.u_trie_string_size(swigCPtr, this);
  }

  public u_array to_array(u_array a) {
    return new u_array(jgrapenlpJNI.u_trie_string_to_array(swigCPtr, this, u_array.getCPtr(a), a), false);
  }

  public int back() {
    return jgrapenlpJNI.u_trie_string_back(swigCPtr, this);
  }

}
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class swig_dht_storage {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected swig_dht_storage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(swig_dht_storage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_swig_dht_storage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libtorrent_jni.swig_dht_storage_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.swig_dht_storage_change_ownership(this, swigCPtr, true);
  }

  public void set_params(sha1_hash id, dht_settings settings) {
    if (getClass() == swig_dht_storage.class) libtorrent_jni.swig_dht_storage_set_params(swigCPtr, this, sha1_hash.getCPtr(id), id, dht_settings.getCPtr(settings), settings); else libtorrent_jni.swig_dht_storage_set_paramsSwigExplicitswig_dht_storage(swigCPtr, this, sha1_hash.getCPtr(id), id, dht_settings.getCPtr(settings), settings);
  }

  public boolean get_peers(sha1_hash info_hash, boolean noseed, boolean scrape, entry peers) {
    return (getClass() == swig_dht_storage.class) ? libtorrent_jni.swig_dht_storage_get_peers(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash, noseed, scrape, entry.getCPtr(peers), peers) : libtorrent_jni.swig_dht_storage_get_peersSwigExplicitswig_dht_storage(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash, noseed, scrape, entry.getCPtr(peers), peers);
  }

  public void announce_peer(sha1_hash info_hash, tcp_endpoint endp, String name, boolean seed) {
    if (getClass() == swig_dht_storage.class) libtorrent_jni.swig_dht_storage_announce_peer(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash, tcp_endpoint.getCPtr(endp), endp, name, seed); else libtorrent_jni.swig_dht_storage_announce_peerSwigExplicitswig_dht_storage(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash, tcp_endpoint.getCPtr(endp), endp, name, seed);
  }

  public boolean get_immutable_item(sha1_hash target, entry item) {
    return (getClass() == swig_dht_storage.class) ? libtorrent_jni.swig_dht_storage_get_immutable_item(swigCPtr, this, sha1_hash.getCPtr(target), target, entry.getCPtr(item), item) : libtorrent_jni.swig_dht_storage_get_immutable_itemSwigExplicitswig_dht_storage(swigCPtr, this, sha1_hash.getCPtr(target), target, entry.getCPtr(item), item);
  }

  public void put_immutable_item(sha1_hash target, String buf, int size, address addr) {
    libtorrent_jni.swig_dht_storage_put_immutable_item__SWIG_0(swigCPtr, this, sha1_hash.getCPtr(target), target, buf, size, address.getCPtr(addr), addr);
  }

  public void put_immutable_item(sha1_hash target, byte_vector buf, address addr) {
    if (getClass() == swig_dht_storage.class) libtorrent_jni.swig_dht_storage_put_immutable_item__SWIG_1(swigCPtr, this, sha1_hash.getCPtr(target), target, byte_vector.getCPtr(buf), buf, address.getCPtr(addr), addr); else libtorrent_jni.swig_dht_storage_put_immutable_itemSwigExplicitswig_dht_storage__SWIG_1(swigCPtr, this, sha1_hash.getCPtr(target), target, byte_vector.getCPtr(buf), buf, address.getCPtr(addr), addr);
  }

  public long get_mutable_item_seq_num(sha1_hash target) {
    return (getClass() == swig_dht_storage.class) ? libtorrent_jni.swig_dht_storage_get_mutable_item_seq_num(swigCPtr, this, sha1_hash.getCPtr(target), target) : libtorrent_jni.swig_dht_storage_get_mutable_item_seq_numSwigExplicitswig_dht_storage(swigCPtr, this, sha1_hash.getCPtr(target), target);
  }

  public boolean get_mutable_item(sha1_hash target, long seq, boolean force_fill, entry item) {
    return (getClass() == swig_dht_storage.class) ? libtorrent_jni.swig_dht_storage_get_mutable_item(swigCPtr, this, sha1_hash.getCPtr(target), target, seq, force_fill, entry.getCPtr(item), item) : libtorrent_jni.swig_dht_storage_get_mutable_itemSwigExplicitswig_dht_storage(swigCPtr, this, sha1_hash.getCPtr(target), target, seq, force_fill, entry.getCPtr(item), item);
  }

  public void put_mutable_item(sha1_hash target, String buf, int size, String sig, long seq, String pk, String salt, int salt_size, address addr) {
    libtorrent_jni.swig_dht_storage_put_mutable_item__SWIG_0(swigCPtr, this, sha1_hash.getCPtr(target), target, buf, size, sig, seq, pk, salt, salt_size, address.getCPtr(addr), addr);
  }

  public void put_mutable_item(sha1_hash target, byte_vector buf, byte_vector sig, long seq, byte_vector pk, byte_vector salt, address addr) {
    if (getClass() == swig_dht_storage.class) libtorrent_jni.swig_dht_storage_put_mutable_item__SWIG_1(swigCPtr, this, sha1_hash.getCPtr(target), target, byte_vector.getCPtr(buf), buf, byte_vector.getCPtr(sig), sig, seq, byte_vector.getCPtr(pk), pk, byte_vector.getCPtr(salt), salt, address.getCPtr(addr), addr); else libtorrent_jni.swig_dht_storage_put_mutable_itemSwigExplicitswig_dht_storage__SWIG_1(swigCPtr, this, sha1_hash.getCPtr(target), target, byte_vector.getCPtr(buf), buf, byte_vector.getCPtr(sig), sig, seq, byte_vector.getCPtr(pk), pk, byte_vector.getCPtr(salt), salt, address.getCPtr(addr), addr);
  }

  public void tick() {
    if (getClass() == swig_dht_storage.class) libtorrent_jni.swig_dht_storage_tick(swigCPtr, this); else libtorrent_jni.swig_dht_storage_tickSwigExplicitswig_dht_storage(swigCPtr, this);
  }

  public swig_dht_storage_counters swig_counters() {
    return new swig_dht_storage_counters((getClass() == swig_dht_storage.class) ? libtorrent_jni.swig_dht_storage_swig_counters(swigCPtr, this) : libtorrent_jni.swig_dht_storage_swig_countersSwigExplicitswig_dht_storage(swigCPtr, this), true);
  }

  public swig_dht_storage() {
    this(libtorrent_jni.new_swig_dht_storage(), true);
    libtorrent_jni.swig_dht_storage_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}

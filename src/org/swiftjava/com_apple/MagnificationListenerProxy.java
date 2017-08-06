
/// interface com.apple.eawt.event.MagnificationListener ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class MagnificationListenerProxy implements com.apple.eawt.event.MagnificationListener {

    long __swiftObject;

    MagnificationListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void com.apple.eawt.event.MagnificationListener.magnify(com.apple.eawt.event.MagnificationEvent)

    public native void __magnify( long __swiftObject, com.apple.eawt.event.MagnificationEvent arg0 );

    public void magnify( com.apple.eawt.event.MagnificationEvent arg0 ) {
        __magnify( __swiftObject, arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
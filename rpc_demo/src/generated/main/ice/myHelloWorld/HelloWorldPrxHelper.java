// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `HelloWorld.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package myHelloWorld;

/**
 * Provides type-specific helper functions.
 **/
public final class HelloWorldPrxHelper extends Ice.ObjectPrxHelperBase implements HelloWorldPrx
{
    private static final String __say_name = "say";

    public void say(String s)
    {
        say(s, null, false);
    }

    public void say(String s, java.util.Map<String, String> __ctx)
    {
        say(s, __ctx, true);
    }

    private void say(String s, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_say(begin_say(s, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_say(String s)
    {
        return begin_say(s, null, false, false, null);
    }

    public Ice.AsyncResult begin_say(String s, java.util.Map<String, String> __ctx)
    {
        return begin_say(s, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_say(String s, Ice.Callback __cb)
    {
        return begin_say(s, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_say(String s, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_say(s, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_say(String s, Callback_HelloWorld_say __cb)
    {
        return begin_say(s, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_say(String s, java.util.Map<String, String> __ctx, Callback_HelloWorld_say __cb)
    {
        return begin_say(s, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_say(String s, 
                                     IceInternal.Functional_VoidCallback __responseCb, 
                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_say(s, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_say(String s, 
                                     IceInternal.Functional_VoidCallback __responseCb, 
                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_say(s, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_say(String s, 
                                     java.util.Map<String, String> __ctx, 
                                     IceInternal.Functional_VoidCallback __responseCb, 
                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_say(s, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_say(String s, 
                                     java.util.Map<String, String> __ctx, 
                                     IceInternal.Functional_VoidCallback __responseCb, 
                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_say(s, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_say(String s, 
                                      java.util.Map<String, String> __ctx, 
                                      boolean __explicitCtx, 
                                      boolean __synchronous, 
                                      IceInternal.Functional_VoidCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_say(s, 
                         __ctx, 
                         __explicitCtx, 
                         __synchronous, 
                         new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_say(String s, 
                                      java.util.Map<String, String> __ctx, 
                                      boolean __explicitCtx, 
                                      boolean __synchronous, 
                                      IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__say_name, __cb);
        try
        {
            __result.prepare(__say_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(s);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_say(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __say_name);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static HelloWorldPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), HelloWorldPrx.class, HelloWorldPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static HelloWorldPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), HelloWorldPrx.class, HelloWorldPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static HelloWorldPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), HelloWorldPrx.class, HelloWorldPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static HelloWorldPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), HelloWorldPrx.class, HelloWorldPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static HelloWorldPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, HelloWorldPrx.class, HelloWorldPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static HelloWorldPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, HelloWorldPrx.class, HelloWorldPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::myHelloWorld::HelloWorld"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, HelloWorldPrx v)
    {
        __os.writeProxy(v);
    }

    public static HelloWorldPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            HelloWorldPrxHelper result = new HelloWorldPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}

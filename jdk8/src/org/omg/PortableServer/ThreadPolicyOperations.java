package org.omg.PortableServer;


/**
* org/omg/PortableServer/ThreadPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 22 April 2020 09:48:48 o'clock IST
*/


/**
	 * The ThreadPolicy specifies the threading model 
	 * used with the created POA. The default is 
	 * ORB_CTRL_MODEL.
	 */
public interface ThreadPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.ThreadPolicyValue value ();
} // interface ThreadPolicyOperations

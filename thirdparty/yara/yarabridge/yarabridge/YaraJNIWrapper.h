/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_sleuthkit_autopsy_yara_YaraJNIWrapper */

#ifndef _Included_org_sleuthkit_autopsy_yara_YaraJNIWrapper
#define _Included_org_sleuthkit_autopsy_yara_YaraJNIWrapper
#ifdef __cplusplus
extern "C" {
#endif
	/*
	* Class:     org_sleuthkit_autopsy_yara_YaraJNIWrapper
	* Method:    FindRuleMatch
	* Signature: (Ljava/lang/String;[B)Ljava/util/List;
	*/
	JNIEXPORT jobject JNICALL Java_org_sleuthkit_autopsy_yara_YaraJNIWrapper_findRuleMatch
	(JNIEnv *, jclass, jstring, jbyteArray, jint, jint);

	/*
	* Class:     org_sleuthkit_autopsy_yara_YaraJNIWrapper
	* Method:    findRuleMatchFile
	* Signature: (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
	*/
	JNIEXPORT jobject JNICALL Java_org_sleuthkit_autopsy_yara_YaraJNIWrapper_findRuleMatchFile
	(JNIEnv *, jclass, jstring, jstring, jint);

#ifdef __cplusplus
}
#endif
#endif

#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_mahmutsaglam_androidemulator_EmulatorUtils_getNativeMessage(JNIEnv* env, jobject) {
    std::string hello = "Hello from C++ JNI!";
    return env->NewStringUTF(hello.c_str());
}

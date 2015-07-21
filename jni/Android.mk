LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

$(call import-add-path,$(LOCAL_PATH)/../../cocos2d)
$(call import-add-path,$(LOCAL_PATH)/../../cocos2d/external)
$(call import-add-path,$(LOCAL_PATH)/../../cocos2d/cocos)

LOCAL_MODULE := cocos2dcpp_shared

LOCAL_MODULE_FILENAME := libcocos2dcpp

LOCAL_SRC_FILES := hellocpp/main.cpp \
                   ../../Classes/AppDelegate.cpp \
                   ../../Classes/MenuScreen.cpp \
                   ../../Classes/FileLocator.cpp \
                   ../../Classes/GamePlay.cpp \
                   ../../Classes/Face.cpp \
                   ../../Classes/IntegerHolder.cpp \
                   ../../Classes/Splash.cpp \
                   ../../Classes/GameOverLayer.cpp \
                   ../../Classes/Score.cpp \
                   ../../Classes/Clock.cpp \
                   ../../Classes/Help.cpp \
                   ../../Classes/Credits.cpp

LOCAL_C_INCLUDES := $(LOCAL_PATH)/../../Classes

LOCAL_STATIC_LIBRARIES := cocos2dx_static

include $(BUILD_SHARED_LIBRARY)

$(call import-module,.)

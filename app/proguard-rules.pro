# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in C:\Users\Administrator\AppData\Local\Android\sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

#友盟统计的混淆
-keepclassmembers class * {
   public <init> (org.json.JSONObject);
}

#友盟统计  由于有反射机制所以要保证R文件中int不被混淆
-keep public class com.paxw.path.R$*{
public static final int *;
}

#友盟统计 5.0.0sdk版本请添加这个
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}


#有米sdk
-dontwarn net.youmi.android.**
-keep class net.youmi.android.** {
    *;
}
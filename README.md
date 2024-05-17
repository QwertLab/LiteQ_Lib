# LiteQ
# Sample Project

> LiteQ SDK 최신버전은 3.5.2 버전입니다.

자세한 내용은 <a href="https://api.qwertlab.com/liteq/index.php" taregt="_blank">API Document 사이트</a>에서 확인해보실 수 있습니다.

<br>
<h3>연동가이드</h3>
<hr>

* settings.gradle(Project Settings) 설정

> LiteQ SDK는 Maven 저장소를 통해 배포되고 있습니다. settings.gradle 파일에 LiteQ Maven 정보를 등록합니다.
<br>

```java
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            google()
            mavenCentral()
            
            //-- Repository for Qwertlab SDK -----------------------------------
            maven { 
              url 'https://sdk.qwertlab.com/repository/internal' 
            }
            //---------------------------------------------------
          
        }
    }
```
<br>

* build.gradle(Module:) 설정


> LiteQ SDK를 dependencies에 implementation 합니다.<br>
> Gradle Plugin 4.1 이상을 사용하실 경우 네이티브 디버그 기호파일이 생성될 수 있도록 debugSymbolLevel을 추가합니다.<br>
> (<a href='https://developer.android.com/reference/tools/gradle-api/7.3/com/android/build/api/dsl/Ndk#debugSymbolLevel()' taget='_blank'>디버그 심볼 관련내용</a>)<br>
> LiteQ SDK 최신버전은 3.5.2 버전입니다.<br>
> lastest.release 버전을 참조할 경우 항상 최신 LiteQ SDK를 참조하실 수 있습니다.<br>


```java
    ...

    android {
      buildTypes {
      
          //-- FOR LiteQ -------------------------------------------------------------------------------
          debug {
              ndk {
                  debugSymbolLevel 'SYMBOL_TABLE'
              }
          }
          release {
              ndk {
                  debugSymbolLevel 'SYMBOL_TABLE'
              }
          }
          //------------------------------------------------------------------------------------------
          
      }
    }
    
    ...

    dependencies {

        ...
        
        //-- FOR LiteQ -------------------------------------------------------------------------------
        implementation 'com.qwertlab.liteq:LiteQ:3.5.2'

        //-- FOR LiteQ latest release version --------------------------------------------------------
        implementation 'com.qwertlab.liteq:LiteQ:latest.release'
        
        ...
    }
    
    ...
```

<br>

* 연동 API 호출

> 귀사의 메인 액티비티의 onCreate() Method에 LiteQ API를 호출합니다.
  
<br>

```java
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ...
        
        //-- LiteQ SDK Call ------------------------------------------------------------------------
        LiteQManager.initLiteQ(MainActivity.this, "Agent사이트에서 발급받은 AgentKey");
        //------------------------------------------------------------------------------------------
        
        ....
        
    }
```

<br>

* 연동확인

> LiteQManger로 로그 검색을 통해 연동이 잘되었는지 확인합니다.

<p align="center">
<img src='https://api.qwertlab.com/images/liteq/log.png' />
</p>

<br>

보다 더 자세한 내용을 확인하고 싶으시다면 아래의 링크 정보를 통해서 확인해보실 수 있습니다.

* <a href="https://api.qwertlab.com/liteq/index.php">API Document</a>
* <a href="https://agent.qwertlab.com/">회원가입(Agent사이트)</a>
* <a href="https://www.qwertlab.com//">홈페이지</a>


<br>

<h3>License</h3>
<hr>

```java

Copyright © 2019-2024 QwertLab Inc. All Rights Reserved.

```





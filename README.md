<img src="https://capsule-render.vercel.app/api?type=waving&color=00BFFE&height=200&section=header&text=Hyunsic's%20Github&fontSize=50" />


# My Portfolio
<a href="https://glory-donkey-b49.notion.site/Hyunsic-s-Portfolio-6e7ffe92e5e946b38546c163ac8ecfa9?pvs=4">
	<img src="https://img.shields.io/badge/Notion-000000?style=flat&logo=Notion&logoColor=white" /></a>

 
## Introduction
안녕하십니까.

더 나은 개발자가 되기 위해 노력중인 김현식입니다.

저는 어려서부터 수학을 좋아하였는데 친구의 권유로 IT교육을 받게되었는데,

수학을 좋아했던 이유인 알고리즘을 해결하거나 문제를 해결하고 원하는 결과물을 도출하기 위해 공식을 만드는 것과 같은 재미를 느끼게 되었습니다.

여기에 제가 학원에서 진행한 프로젝트부터 개인적으로 공부하기 위해 만들어본 작업물들, 공부한 흔적 등을 남겨놓았으니 참고부탁드리겠습니다.

## Projects
### Project 1
- 프로젝트 이름: 스마트팜
- 프로젝트 기간: 2023/11/01 ~ 2022/11/25
- 프로젝트 설명: 교육 과정의 팀프로젝트로 App을 통해 스마트팜을 조작하는 시스템을 만들었으며, 저는 이 프로젝트에서 전체적인 구상과 데이터 전송 및 가공처리에 공동으로 맡았으며 세부적인 오류 해결을 중점으로 맡았습니다.
- 프로젝트 중 에로사항과 해결방안 :

	- IOT의 경우 학원에서 진행하다보니 고장난 기기들도 많고 프로젝트를 진행하는중에도 고장이 많았던게 가장 큰 문제였습니다.<br/>
	그래서 각 기기들의 간단한 테스트를 통해 사용이 가능한 기기들을 여러개 두고 바로 기기만 바꿔서 낄 수 있도록 세팅한 후 프로젝트를 진행하였습니다.

	- 두번째로는 안드로이드 스튜디오에서 각 메서드들의 생명주기에 대한 지식의 부재였습니다.<br/>
	짧은 교육 일정으로 생명주기에 따라 어디에서 어디까지 데이터가 보존되는지를 모르다보니 다른 조원이 만든 외부에서 가져온 방식의 코드를 이해하는데 시간이 많이 걸렸습니다.

	- 마지막으로는 전자회로등에 대한 이해부족이었습니다.<br/>
	IOT의 특성상 전자기기기에 저항과 전압등을 고려하여 만들어야하나 이에대한 지식의 부재는 좀 더 좋은 퀄리티의 작업물을 만들기에 부족하였으며 이 부분은 좀 더 보완할 생각입니다.
### Project 2
- 프로젝트 이름: Baragi 웹 콘텐츠 제작
- 프로젝트 기간: 2023/11/25 ~ 2023/12/18
- 프로젝트 설명: <br/>교육 과정의 팀프로젝트로 스마트팜을 기반으로 체험프로그램을 운영하는 회사의 웹사이트를 개발했습니다.<br/>
  		저는 이 프로젝트에서 전체적인 기획과 DB설계 및 로그인, 프로그램과 체험인원 등록 및 관리와 같은 관리자 페이지와 지도부분을 중점으로 맡았습니다.
- 프로젝트 중 에로사항과 해결방안 :

	- 우선 이 프로젝트를 진행하며 중간에 의도치않은 인원감축이 있었습니다.<br/>
  	원래 같이 만들기로했던 조원이 조기취업함으로서 일정에 차질이 생겼는데 전체적인 컨셉만 지정하고 세부적인 부분은 자신이 원하는 방식으로 작업하기로 했는데<br/>
    	그로인해 막바지에 추가 작업이 생겨 DB의 항목구성부터 작업분배까지 짧은 기간안에 해야했습니다.<br/>
    	다행히 전체적인 기획에 관여하고 있었기에 필요한 사항과, 현재까지의 작업을 통해 가장 유사한 작업을 분배하는 과정을 빠른 시간안에 끝낼 수 있었습니다.
  
	- 두번째로 인원이 줄다보니 개인에게 할당된 작업량이 많아져 요구사항이 제대로 전달되지 않거나 결과물을 취합했을 때 생기는 오류 등을 제대로 확인하지 못하는 경우들이 많아졌습니다.<br/>
    	그래서 단순히 개인작업만 하지 않고 중간중간 다른 사람의 작업을 보며 어떻게 할건지 물어보고 작업한 부분들이 다른 환경에서도 원하는데로 잘 작동하는지 체크했습니다.

	- 세번째로 주소를 변경하는 로직을 짰는데 교통정보는 그대로인 문제가 있었습니다.<br/>
    	처음에는 카카오맵 API의 문서를 보며 답을 찾으려했지만 찾다보니 지원하지 않는 내용이었습니다.<br/>
    	물론 주소를 변경하는 일이 그리 많지는 않지만 주소를 변경하는 로직을 짠 이상 같이 변경하는것을 만들어보고 싶었습니다.<br/>
    	그래서 처음에는 주소를 통해 장소ID를 추출하고 장소ID를 이용하여 근처 교통정보가 저장된 json파일을 받아 데이터를 추출하였습니다.<br/>
    	하지만 카카오측에서 공식적으로는 지원하지 않기에 나중에도 이상없이 쓸거라 보장하긴 힘들고, 개인 주택등은 장소ID가 존재하지 않는 단점이 있어 이는 추후 다시 고려해보려합니다.
- 깃허브 주소 : <a href="https://github.com/588886/Project"><img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white" /></a>
### Project 3
- 프로젝트 이름: 위*경도 변환 사이트
- 프로젝트 기간: 2024/02/10 ~ 2024/02/20
- 프로젝트 설명: <br/>개인 프로젝트로서 위도나 경도 등을 확인해야하는 경우가 있을 때 매번 찾는 고생을 덜고자 직접 만들었습니다.<br/>
  		우선 다음맵 API를 통해 정확한 주소를 추출하고 그 주소를 토대로 경도와 위도를 추출하는 간단한 사이트를 제작하였습니다.
  		또한 학원에서 배웠던 레거시 프로젝트가 아닌 그래들을 이용한 프로젝트의 진행방식을 익히기위해 그래들로 제작해봤습니다.
- 프로젝트 중 에로사항과 해결방안 :
  	- 학원에서 배웠던 방식이 아닌 방식이라 어디에 파일을 둬야하는지부터 제대로 파악이 힘들었습니다.<br/>
	그래서 인프런 강의 및 검색을 통해 어디에 있는 파일을 가져오는를 확인하여 작성하였습니다.
- 깃허브 주소 : <a href="https://github.com/588886/trans-lines-of-longitude-and-latitude"><img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white" /></a>

## Skills
### Lagnuages & Platforms
<div align="center">
	<img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white" />
	<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=HTML5&logoColor=white" />
	<img src="https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=CSS3&logoColor=white" />
	<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=JavaScript&logoColor=white" />
	<img src="https://img.shields.io/badge/jQuery-0769AD?style=flat&logo=jQuery&logoColor=white" />	
	<img src="https://img.shields.io/badge/Android Studio-3DDC84?style=flat&logo=Android Studio&logoColor=white" />
	<img src="https://img.shields.io/badge/Oracle-F80000?style=flat&logo=Oracle&logoColor=white" />
	<img src="https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=Spring&logoColor=white" />
	<img src="https://img.shields.io/badge/Bootstrap-7952B3?style=flat&logo=Bootstrap&logoColor=white" />
	<img src="https://img.shields.io/badge/Arduino-00878F?style=flat&logo=Arduino&logoColor=white" />
	
</div>

### Tools
<div align="center">	
	<img src="https://img.shields.io/badge/Eclipse IDE-2C2255?style=flat&logo=Eclipse IDE&logoColor=white" />
	<img src="https://img.shields.io/badge/Visual Studio Code-007ACC?style=flat&logo=Visual Studio Code&logoColor=white" />
	<img src="https://img.shields.io/badge/Apache Tomcat-F8DC75?style=flat&logo=Apache Tomcat&logoColor=white" />
	<img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white" />
	
</div>

### Studying
How to Skill up myself?
 - Baekjoon, 프로그래머스 스쿨을 사용하여 알고리즘 문제풀이를 통한 논리력과 언어 실력을 향상중입니다. 
 - 이론적 학습의 갈증을 해결하기 위해 정보처리기사 자격증을 준비하고 있습니다. 
 - "왜"라는 질문을 통해 능동적 해결력을 기르기 위해 노력합니다.
 - 빅데이터와 AI를 기반으로 하는 부분을 더 공부하려고합니다.
 - 비전공자라는 부족함을 채우기 위해 개념등을 블로그를 통해 따로 정리하고 있습니다.
 - 인프런 강의를 들으며 자바와 스프링에 대한 이해도를 높여가고 있습니다.

<div>

<img src="https://github-readme-stats.vercel.app/api/top-langs/?username=588886&layout=compact">

<img src="https://github-readme-stats.vercel.app/api?username=588886&show_icons=true">

</div>


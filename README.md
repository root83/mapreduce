MapReduce Basic
==================


- Output 디렉토리 생성

>hadoop fs -mkdir -p /output


- Output 디렉토리 비우기

>hadoop fs -rm -r /output/*


- 파일 덮어쓰기

>hadoop fs -copyFromLocal -f /upload


- Driver Class의 실행

>hadoop jar ~/test.jar skill.coach.TestDriver -D inputPath=/upload/acc/Accidents0513.csv -D outputPath=/output/result

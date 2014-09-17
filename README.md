MapReduce Lecture
==================

- HDFS 계정 전환

>su - hdfs

<br>

- Output 디렉토리 생성

>hadoop fs -mkdir -p /output

<br>

- Output 디렉토리 비우기

>hadoop fs -rm -r /output/*

<br>

- 파일 덮어쓰기

>hadoop fs -copyFromLocal -f Accidents0513.csv /upload/acc

<br>

- 파일 내용보기

>hadoop fs -cat /output/result01/part-r-00000

<br>

- HDFS의 파일을 Local로 다운로드

>hadoop fs -get /output/result01/part-r-00000 result01.txt

<br>

- HDFS의 파일을 병합하여 Local로 다운로드

>hadoop fs -getmerge /output/result01 result01.txt

<br>

- Driver Class의 실행

>hadoop jar ~/test01.jar skill.coach.TestDriver -D inputPath=/upload/acc/Accidents0513.csv -D outputPath=/output/result01 -D numReduceTasks=3

import cv2
from matplotlib import pyplot as plt

#불러올 이미지 경로
image_file = '../image/eximgF.jpg'

#cv2.IMREAD_COLOR : 수정 없는 원본 이미지 읽기
original = cv2.imread(image_file, cv2.IMREAD_COLOR)

#cv2.IMREAD_GRAYSCALE : 흑백사진으로 수정해서 이미지 일기
gray = cv2.imread(image_file, cv2.IMREAD_GRAYSCALE)

#cv2.IMREAD_UNCHANGED : 이미지 파일의 알파 채널(Alpha CHannel)까지 포함해서 읽기
unchange = cv2.imread(image_file, cv2.IMREAD_UNCHANGED)

#OpenCV 색상을 일반적으로 부르는 RGB로 순서가 아닌, BGR 순서로 사용함
color = ('b', 'g', 'r')

#색상이 존재하는 원본이미지 히스토그램
#BGR 순서대로 그래프 그리기 위해 반복문 사용함
for i, col in enumerate(color):
    """
    colcHist 파라미터 설명
    images : 분석할 이미지 파일
    Channel : 컬러이미지(BGR)이면, 배열 값 3개로 정의
    Mask : 분석할 영역의 형태인 mask
    histSize : 히스토그램의 hist 크기로 64면 256/64 = > 4, 4픽셀을 1로 합쳐서 평균값
    범위 : 컬러이미지(BGR)이면 0~256까지 배열
    """
    hist = cv2.calcHist([original], [i], None, [256], [0,256])
    plt.figure(1)
    plt.plot(hist, color = col)

#원본이미지 히스토그램 출력
plt.show()

#흑백사진으로 히스토그램 보기
hist = cv2.calcHist([gray], [0], None, [256], [0,256])
plt.figure(2)
plt.plot(hist)
plt.show()

#히스토그램 평활화, 흑백사진만 가능함
gray = cv2.equalizeHist(gray)

#히스토글매 평활화된 히스토그램 보기
hist = cv2.calcHist([gray], [0], None, [256], [0,256])
plt.figure(3)
plt.plot(hist)
plt.show()

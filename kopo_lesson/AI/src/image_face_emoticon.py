import cv2

#분석하기 위한 이미지 불러오기
image = cv2.imread("..\image\peopleEx3_2.jpg", cv2.IMREAD_COLOR)

#흑백사진으로 변경
gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

#변환한 흑백사진으로부터 히스토그램 활성화
gray = cv2.equalizeHist(gray)

#덮어 쓸 이미지 컬러로 읽기
emoticon_image = cv2.imread("../image/icon.jpg", cv2.IMREAD_COLOR)

if image is None: raise Exception("이미지 읽기 실패")

#학습된 얼굴 정면 검출기 사용하기
face_cascade = cv2.CascadeClassifier("../data/face.xml")

"""
얼굴 검출 수행(정확도를 높이려면 파라미터 조정)
scaleFactor : 1.1
minNeighbors : 인근 유사 픽셀 발견 비율이 5번 이상
flags : 0 -> 더 이상 사용하지 않는 인자값
분석할 이미지의 최소 크기 : 가로 세로 100 
"""
faces = face_cascade.detectMultiScale(gray, 1.1, 5, 0, (100,100))

facesCnt = len(faces)

print(len(faces))

if(facesCnt) > 0:
    for face in faces:
        x, y, w, h = face

        #이모티콘 이미지를 얼굴 영역 크기의 사이즈로 변경하며, 얼굴영역 크기를 벗어나면 크기에 맞추고
        #얼굴 영역 이미지를 이모티콘 이미지로 변경
        face_image = cv2.resize(emoticon_image, (w,h), interpolation = cv2.INTER_AREA)


        #원본 이미지로부터 얼굴영역 가져오기
        image[y:y + h, x:x + w] = face_image


        #원본에 내가 만든 모자이크 이미지를 덮어 씌워라
        image[y:y + h, x:x +w] = face_image
    cv2.imwrite("../result/my_image_emoticon.jpg", image)
    cv2.imshow("mosaic_image", cv2.imread("../result/my_image_emoticon.jpg", cv2.IMREAD_COLOR))
else: print("얼굴 미검출")

cv2.imshow("Face!!!", image)

cv2.waitKey(0)
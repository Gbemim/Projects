from googleapiclient.discovery import build
# import google_auth_oauthlib.flow
# import googleapiclient.errors

api_key = "AIzaSyD5L7QUOO5Hpf2QVRwCJ2zUTzxOdWvXsPM"


def main():
    youtube = build(
        "youtube", "v3", developerKey=api_key)

    request = youtube.search().list(
        part="snippet", type="video", maxResults=25, order='date')
    inputOfUser = input("Indicate: ")
    res = request.execute()
    # var = ""

    for title in res["items"]:
        descrip = title["snippet"]["description"]

        if inputOfUser in descrip:
            print(title["snippet"]["title"])
            print("\n")

    # if title == "":
    #     var = "There is no promo code from this supplier"

    # print(var)


if __name__ == "__main__":
    main()

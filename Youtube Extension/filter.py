# from googleapiclient.discovery import build
# # import google_auth_oauthlib.flow
# # import googleapiclient.errors

# api_key = "zUTzxOdWvXsPM"


# def main():
#     youtube = build(
#         "youtube", "v3", developerKey=api_key)

#     request = youtube.search().list(
#         part="snippet", type="video", maxResults=25, order='date')
#     inputOfUser = input("Indicate: ")
#     res = request.execute()
#     # var = ""

#     for title in res["items"]:
#         descrip = title["snippet"]["description"]

#         if inputOfUser in descrip:
#             print(title["snippet"]["title"])
#             print("\n")

#     # if title == "": 
#     #     var = "There is no promo code from this supplier"

#     # print(var)


# if __name__ == "__main__":
#     main()


# -*- coding: utf-8 -*-

# Sample Python code for youtube.channels.list
# See instructions for running these code samples locally:
# https://developers.google.com/explorer-help/guides/code_samples#python

import os

import google_auth_oauthlib.flow
import googleapiclient.discovery
import googleapiclient.errors

scopes = ["https://www.googleapis.com/auth/youtube.readonly"]


def main():
    # Disable OAuthlib's HTTPS verification when running locally.
    # *DO NOT* leave this option enabled in production.
    os.environ["OAUTHLIB_INSECURE_TRANSPORT"] = "1"

    api_service_name = "youtube"
    api_version = "v3"
    client_secrets_file = "./client_id.json"

    # Get credentials and create an API client
    flow = google_auth_oauthlib.flow.InstalledAppFlow.from_client_secrets_file(
        client_secrets_file, scopes)
    credentials = flow.run_console()
    youtube = googleapiclient.discovery.build(
        api_service_name, api_version, )

    request = youtube.channels().list(
        part="snippet,contentDetails,statistics",
        id="UC_x5XG1OV2P6uZZ5FSM9Ttw"
    )
    response = request.execute()

    print(response)


if __name__ == "__main__":
    main()
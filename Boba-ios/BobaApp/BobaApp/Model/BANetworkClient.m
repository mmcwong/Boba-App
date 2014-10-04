//
//  BANetworkClient.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BANetworkClient.h"
#import <AFNetworking/AFNetworking.h>
#import "BADefine.h"


@interface BANetworkClient()

@property (nonatomic, strong) AFHTTPSessionManager *networkManager;

@end

@implementation BANetworkClient

+ (id)sharedClient {
    static BANetworkClient *sharedClient = nil;
    static dispatch_once_t once_token;
    dispatch_once(&once_token, ^{
        sharedClient = [[self alloc] init];
    });
    
    return sharedClient;
}

- (instancetype)init
{
    self = [super init];
    if (self) {
        self.networkManager = [AFHTTPSessionManager manager];
    }
    return self;
}

#pragma mark - User

- (void)registerNewUserWithUserEmail:(NSString *)userEmail phoneNumber:(NSString *)phoneNumber success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/user", kAPIBaseUrl];
    NSDictionary *parameters = @{@"email":userEmail, @"phone_no":phoneNumber};
    [self.networkManager POST:urlString parameters:parameters success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

- (void)getUserDetailsWithUserEmail:(NSString *)userEmail success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/user/%@", kAPIBaseUrl, userEmail];
    
    [self.networkManager GET:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

#pragma mark - Group

- (void)createNewGroupWithGroupName:(NSString *)groupName groupPassword:(NSString *)groupPassword success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/group", kAPIBaseUrl];
    NSDictionary *parameters = @{@"group_name":groupName, @"group_password":groupPassword};
    
    [self.networkManager POST:urlString parameters:parameters success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
    
}

- (void)addNewGroupMemberWithGroupName:(NSString *)groupName userEmail:(NSString *)userEmail success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/group/%@/user", kAPIBaseUrl, groupName];
    NSDictionary *parameters = @{@"user_email":userEmail};
    
    [self.networkManager POST:urlString parameters:parameters success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

#pragma mark - Run
- (void)getCurrentActiveRunsWithGroupName:(NSString *)groupName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/group/%@", kAPIBaseUrl, groupName];
    
    [self.networkManager GET:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

- (void)createNewRunWithGroupName:(NSString *)groupName runName:(NSString *)runName yelpId:(NSString *)yelpId orderTime:(long)orderTime expireTime:(long)expireTime success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/group/%@/run", kAPIBaseUrl, groupName];
    NSDictionary *parameters = @{@"run_name":runName,
                                 @"yelp_id":yelpId,
                                 @"order_time":@(orderTime),
                                 @"expire_time":@(expireTime)};
    
    [self.networkManager POST:urlString parameters:parameters success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

- (void)getRunStatusWithGroupName:(NSString *)groupName runName:(NSString *)runName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/group/%@/run/%@", kAPIBaseUrl, groupName, runName];
    
    [self.networkManager GET:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

- (void)addUserToRunWithUserEmail:(NSString *)userEmail GroupName:(NSString *)groupName runName:(NSString *)runName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/group/%@/run/%@/user", kAPIBaseUrl, groupName, runName];
    NSDictionary *parameters = @{@"user_id":userEmail};
    
    [self.networkManager POST:urlString parameters:parameters success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

- (void)markRunCompletedWithGroupName:(NSString *)groupName runName:(NSString *)runName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/group/%@/run/%@/complete", kAPIBaseUrl, groupName, runName];
    
    [self.networkManager POST:urlString parameters:nil success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

- (void)markUserPaidWithUserEmail:(NSString *)userEmail groupName:(NSString *)groupName runName:(NSString *)runName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure {
    NSString *urlString = [NSString stringWithFormat:@"%@/group/%@/run/%@/paid" ,kAPIBaseUrl, groupName, runName];
    // user who paid
    NSDictionary *parameters = @{@"user_id":userEmail};
    
    [self.networkManager POST:urlString parameters:parameters success:^(NSURLSessionDataTask *task, id responseObject) {
        success(responseObject);
    } failure:^(NSURLSessionDataTask *task, NSError *error) {
        failure(error);
    }];
}

@end
